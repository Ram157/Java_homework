import java.util.Scanner;

public class SR3task1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("N: ");
        int n=sc.nextInt();
        System.out.print("K: ");
        int k=sc.nextInt();
        int[] a=new int[n];

        System.out.println("Введите элементы массива:");
        for(int i=0;i<n;i++) {
            a[i]=sc.nextInt();
        }

        System.out.println("Элементы с номерами, кратными K:");
        for(int i=k-1;i<n;i+=k) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
