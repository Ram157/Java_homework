import java.util.Scanner;

public class Task3 {
    static double fraction(double x) {
        return x-Math.floor(x);
    }

    static double showParts(double x) {
        double whole=Math.floor(x);
        double part=fraction(x);
        System.out.println("Число: "+x);
        System.out.printf("Целая часть: %.0f%n",whole);
        System.out.println("Дробная часть: "+part);
        return part;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Введите число: ");
        if(!sc.hasNextDouble()) {
            System.out.println("Нужно ввести число");
            return;
        }
        double x=sc.nextDouble();
        if(!Double.isFinite(x)) {
            System.out.println("Неверное число");
            return;
        }
        showParts(x);
    }
}
