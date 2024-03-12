import java.util.Scanner;

public class Slide95bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print(" Nhap so phan tu cua mang : ");
        n = sc.nextInt();
        int Arr[] = new int[n];
        int count = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print(" Nhap phan tu thu  " + i + " : ");
            Arr[i] = sc.nextInt();
            count++;
            sum += Arr[i];
        }
        System.out.println(" Gia tri trung binh la : " + (sum / count));

    }
}
