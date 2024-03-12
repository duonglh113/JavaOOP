import java.util.Scanner;

public class Slide74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print(" Nhap vao so phan tu cua mang : ");
            n = sc.nextInt();

        } while (n <= 0);
        int Arr[] = new int[n];
        System.out.println(" Nhap cac phan tu cho mang : ");
        for (int i = 0; i < n; i++) {
            System.out.print(" Nhap phan tu thu " + i + " :");
            Arr[i] = sc.nextInt();
        }
        double Sum = 0;
        for (int i = 0; i < n; i++) {
            if (Arr[i] % 2 == 0) {
                Sum += Arr[i];
            }
        }
        System.out.print(" Tong cac so chan trong mang = :  " + Sum);

    }
}