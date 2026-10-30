import java.util.Scanner;

public class Task1 {
    static double cosSum(double x,int n) {
        double sum=1;
        double term=1;
        for(int i=1;i<=n;i++) {
            term=term*(-x*x)/((2.0*i-1)*(2.0*i));
            sum+=term;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Введите X в радианах: ");
        if(!sc.hasNextDouble()) {
            System.out.println("Нужно ввести число");
            return;
        }
        double x=sc.nextDouble();
        System.out.print("Введите N (>0): ");
        if(!sc.hasNextInt()) {
            System.out.println("N должно быть целым числом");
            return;
        }
        int n=sc.nextInt();
        if(n<=0||!Double.isFinite(x)) {
            System.out.println("Неверные данные");
            return;
        }
        System.out.println("Сумма = "+cosSum(x,n));
    }
}
