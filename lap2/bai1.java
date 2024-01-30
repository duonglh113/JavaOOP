import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập vào 2 số từ bàn phím
        System.out.print("Nhập số thứ nhất: ");
        double soThuNhat = scanner.nextDouble();

        System.out.print("Nhập số thứ hai: ");
        double soThuHai = scanner.nextDouble();

        // Tính tổng, hiệu, tích, thương, chia lấy dư
        double tong = soThuNhat + soThuHai;
        double hieu = soThuNhat - soThuHai;
        double tich = soThuNhat * soThuHai;

        // Kiểm tra nếu số thứ hai khác 0 để tránh chia cho 0
        double thuong = 0;
        double chiaDu = 0;

        if (soThuHai != 0) {
            thuong = soThuNhat / soThuHai;
            chiaDu = soThuNhat % soThuHai;
        } else {
            System.out.println("Lỗi: Số thứ hai không được là 0 khi thực hiện phép chia!");
        }

        // In kết quả
        System.out.println("Tổng: " + tong);
        System.out.println("Hiệu: " + hieu);
        System.out.println("Tích: " + tich);

        if (soThuHai != 0) {
            System.out.println("Thương: " + thuong);
            System.out.println("Chia lấy dư: " + chiaDu);
        }

        // Sử dụng các toán tử so sánh
        if (soThuNhat > soThuHai) {
            System.out.println(soThuNhat + " lớn hơn " + soThuHai);
        } else if (soThuNhat < soThuHai) {
            System.out.println(soThuNhat + " nhỏ hơn " + soThuHai);
        } else {
            System.out.println("Hai số bằng nhau.");
        }

        // Đóng Scanner
        scanner.close();
    }
}