import java.util.Scanner;

public class SR3task4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("M: ");
        int m=sc.nextInt();
        System.out.print("N: ");
        int n=sc.nextInt();

        int[][] a=new int[m][n];
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                a[i][j]=10*(i+1);
            }
        }

        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
