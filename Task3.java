import java.util.Scanner;

public class Task3 {
    public static int[] countNumbers(int a,int b,int c) {
        int plus=0;
        int minus=0;
        if(a>0) plus++;
        if(b>0) plus++;
        if(c>0) plus++;
        if(a<0) minus++;
        if(b<0) minus++;
        if(c<0) minus++;
        return new int[]{plus,minus};
    }

    public static void main(String[] args) {
        // Небольшие тесты
        int[] t1=countNumbers(1,-2,0);
        System.out.println("Тест 1: "+(t1[0]==1&&t1[1]==1));
        int[] t2=countNumbers(1,2,3);
        System.out.println("Тест 2: "+(t2[0]==3&&t2[1]==0));

        Scanner sc=new Scanner(System.in);
        System.out.println("Введите 3 целых числа:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int[] result=countNumbers(a,b,c);
        System.out.println("Положительных: "+result[0]);
        System.out.println("Отрицательных: "+result[1]);
    }
}
