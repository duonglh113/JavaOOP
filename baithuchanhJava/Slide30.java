import java.util.Scanner;

public class Slide30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap vao so nguyen duong n: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Hay nhap mot so nguyen duong.");

        }
        int tongChuSo = tinhTongChuSo(n);
        System.out.println(" Tong cac chu so trong  " + n + " la " + tongChuSo);
    }

    private static int tinhTongChuSo(int so) {
        int sum = 0;
        while (so > 0) {
            sum += so % 10;
            so /= 10;

        }
        return sum;
    }
}
