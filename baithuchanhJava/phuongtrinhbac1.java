import java.util.Scanner;

public class phuongtrinhbac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap a: ");
        double a = sc.nextDouble();

        System.out.print("Nhap b: ");
        double b = sc.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trinh vo so nghiem");
            } else {
                System.out.println("Phương trinh vo nghiem");
            }
        } else {
            double x = -b / a;
            System.out.println("Nghiem cua phuong trinh: x = " + x);
        }

        sc.close();
    }
}