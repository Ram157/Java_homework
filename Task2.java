import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Введите x: ");
        double x=sc.nextDouble();
        double y=3*Math.pow(x,6)-6*Math.pow(x,2)-5;
        System.out.println("y = "+y);
    }
}
