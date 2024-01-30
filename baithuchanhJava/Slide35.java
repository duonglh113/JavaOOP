import java.util.Scanner;

public class Slide35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Nhap va so thu nhat :");
        int soThuNhat = sc.nextInt();
        System.out.print("Nhap vao so thu hai :");
        int soThuHai = sc.nextInt();
        if( soThuNhat < soThuNhat)
        {
            System.out.println( +soThuNhat);
        }
        else 
        System.out.println("So lon hon la "+soThuHai);

    }
}