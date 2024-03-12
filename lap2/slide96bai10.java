import java.util.Scanner;

public class Slide96bai10 {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.print(" Nhap chuoi : ");
        str = sc.nextLine();
        if( str.length() > 80)
        {
            System.out.println("Ki tu qua dai  ");
            return;
        }
        System.out.print(" Nhap ki tu ");
        char KyTu = sc.next().charAt(0);
        int count = 0;
        for( int i = 0 ; i < str.length(); i++)
        {
            if( str.charAt(i) == KyTu)
            {
               count++;   
            }


        }
        System.out.println("So lan xuat hien cua ki tu '" + KyTu + "' trong chuoi la: " + count);

    }
}