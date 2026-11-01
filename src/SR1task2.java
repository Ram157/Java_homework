import java.util.Scanner;

public class SR1task2 {
    public static double calculate(double x) {
        return 3*Math.pow(x,6)-6*Math.pow(x,2)-5;
    }

    public static void main(String[] args) {
        // Небольшие тесты
        System.out.println("Тест 1: "+(calculate(0)==-5));
        System.out.println("Тест 2: "+(calculate(2)==163));

        Scanner sc=new Scanner(System.in);
        System.out.print("Введите x: ");
        double x=sc.nextDouble();
        System.out.println("y = "+calculate(x));
    }
}
