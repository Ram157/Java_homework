import java.util.Scanner;

public class SR3task2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("N: ");
        int n=sc.nextInt();
        int[] a=new int[n];

        System.out.println("Введите элементы массива:");
        for(int i=0;i<n;i++) {
            a[i]=sc.nextInt();
        }

        int max=0;
        for(int i=0;i<n;i++) {
            int count=0;
            for(int j=0;j<n;j++) {
                if(a[i]==a[j]) count++;
            }
            if(count>max) max=count;
        }
        System.out.println("Максимальное количество одинаковых элементов: "+max);
    }
}
