import java.util.Scanner;

public class SR1task4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Считаем площадь прямоугольника");
        System.out.print("Введите длину: ");
        if(!sc.hasNextDouble()) {
            System.out.println("Ошибка: нужно ввести число");
            return;
        }
        double a=sc.nextDouble();
        System.out.print("Введите ширину: ");
        if(!sc.hasNextDouble()) {
            System.out.println("Ошибка: нужно ввести число");
            return;
        }
        double b=sc.nextDouble();
        if(!Double.isFinite(a)||!Double.isFinite(b)||a<=0||b<=0) {
            System.out.println("Ошибка: стороны должны быть больше нуля");
            return;
        }
        double s=a*b;
        if(!Double.isFinite(s)) {
            System.out.println("Ошибка: слишком большие числа");
            return;
        }
        System.out.println("Площадь = "+s);
    }
}
