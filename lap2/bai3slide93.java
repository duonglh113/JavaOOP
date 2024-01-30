import java.time.Year;
import java.util.Scanner;

public class bai3slide93 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ten : ");
        String ten = sc.nextLine();

        System.out.print("Nhap nam sinh: ");
        int namSinh = sc.nextInt();

        int namHienTai = Year.now().getValue();
        int tuoi = namHienTai - namSinh;

        if (tuoi < 16) {
            System.out.println("Ban " + ten + " o do tuoi vi thanh nien.");
        } else if (tuoi >= 16 && tuoi < 18) {
            System.out.println("Ban " + ten + " o do tuoi truong thanh.");
        } else {
            System.out.println("Ban " + ten + " da gia.");
        }

    }
}