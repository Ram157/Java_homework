import java.util.Scanner;

public class Task2 {
    static double[] find(double eps) {
        int k=1;
        double prev=2;
        while(true) {
            double current=2+1/prev;
            k++;
            if(Math.abs(current-prev)<eps) {
                return new double[]{k,prev,current};
            }
            prev=current;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Введите epsilon (>0): ");
        if(!sc.hasNextDouble()) {
            System.out.println("Нужно ввести число");
            return;
        }
        double eps=sc.nextDouble();
        if(eps<=0||!Double.isFinite(eps)) {
            System.out.println("Epsilon должно быть больше нуля");
            return;
        }
        double[] answer=find(eps);
        System.out.println("K = "+(int)answer[0]);
        System.out.println("A(K-1) = "+answer[1]);
        System.out.println("A(K) = "+answer[2]);
    }
}
