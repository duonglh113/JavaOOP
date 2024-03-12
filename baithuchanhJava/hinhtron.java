import java.util.Scanner;

public class hinhtron {

    final public float PI = 3.14f;
    public float banKinh, chuVi, dienTich;

    public void nhapBanKinh() {
        System.out.print(" R = ");
        Scanner sc = new Scanner(System.in);
        banKinh = sc.nextFloat();
        sc.close();
    }

    public void tinhChuVi() {
        chuVi = 2 * PI * banKinh;
    }

    public void tinhDienTich() {
        dienTich = PI * banKinh * banKinh;
    }

    public void inChuVi() {
        System.out.print(" Chu vi hinh tron =" + chuVi);
    }

    public void inDienTich() {
        System.out.print(" Dien tich cua hinh tron = " + dienTich);
    }

}
