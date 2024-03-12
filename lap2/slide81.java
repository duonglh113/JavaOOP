import java.util.Scanner;

public class Slide81 {
    public static void main(String[] args) {
        int m , n;
        Scanner sc = new Scanner(System.in);
        System.out.print(" Nhap vao so dong cua ma tran :");
         n = sc.nextInt();
         System.out.print(" Nhap vao so cot cua ma tran :");
         m = sc.nextInt();
         int Arr[][] = new int[m][n];
         System.out.print(" Nhap cac phan tu cho ma tran : ");
         for ( int i = 0 ; i < n ; i++)
         {
            for( int j = 0 ; j < m ; j++)
            {
                System.out.print(" A[" + i + "][ " + j + " ] = ");
                Arr[i][j] = sc.nextInt();
            }
        }
        int max = Arr[0][0];
        for ( int i = 0 ; i < m ; i++ )
        {
            for( int j = 0 ; j< n ; j++ )
            {
                if ( max < Arr[i][j])
                {
                    max = Arr[i][j];
                }
            }
        }
        System.out.print(" Phan tu lon nhat trong ma tran la : " + max);
    }
}
