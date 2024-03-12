import java.util.Scanner;

public class Slide96bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
       System.out.print(" Nhap chuoi : ");
        str = sc.nextLine();
        int demso = 0 , demInHoa = 0, demInThuong = 0;
        for( int i = 0 ; i < str.length() ; i++)
        {
            char KyTu = str.charAt(i);
            int asciiValue = ( int) KyTu;
            if( asciiValue >= 48 && asciiValue <=57)
            demso++;
            else if ( asciiValue >=65 && asciiValue <= 90)
            demInHoa++;
            else if( asciiValue >=97 && asciiValue <= 122)
            demInThuong++;
            System.out.println(KyTu);
        }
        System.out.println(" So ky tu so la : "+demso);
        System.out.println(" So ky tu in hoa la : "+demInHoa);
        System.out.println(" So ky tu thuong la : "+demInThuong);

    }
}