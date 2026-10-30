import java.util.Scanner;

public class Task3 {
    static long[] makeB(int[] a) {
        long[] b=new long[a.length];
        long sum=0;
        for(int i=a.length-1;i>=0;i--) {
            sum+=a[i];
            b[i]=sum;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("N: ");
        int n=sc.nextInt();
        int[] a=new int[n];

        System.out.println("Введите элементы массива A:");
        for(int i=0;i<n;i++) {
            a[i]=sc.nextInt();
        }

        long[] b=makeB(a);
        System.out.println("Массив B:");
        for(long x:b) {
            System.out.print(x+" ");
        }
        System.out.println();
    }
}
