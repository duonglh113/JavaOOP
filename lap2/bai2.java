import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số từ bàn phím
        System.out.print("Nhập một số: ");
        int so = scanner.nextInt();

        // Kiểm tra số chẵn hay lẻ
        if (so % 2 == 0) {
            System.out.println(so + " là số chẵn.");
        } else {
            System.out.println(so + " là số lẻ.");
        }

        // Đóng Scanner
        scanner.close();
    }
}