import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите 3 целых числа:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int plus=0;
        int minus=0;
        if(a>0) plus++;
        if(b>0) plus++;
        if(c>0) plus++;
        if(a<0) minus++;
        if(b<0) minus++;
        if(c<0) minus++;
        System.out.println("Положительных: "+plus);
        System.out.println("Отрицательных: "+minus);
    }
}
