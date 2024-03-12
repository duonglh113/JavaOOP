import java.util.Scanner;

public class person {

    public String hovaten;
    public int tuoi;
    public String quequan;

    public void nhapthongtin(){
        Scanner sc =new Scanner(System.in);
        System.out.println("nhaphovaten: ");
        hovaten =sc.next();
        System.out.println("nhapsotuoi:  ");
        tuoi = sc.nextInt();
        System.out.println("nhapquequan: ");
        quequan =sc.next();
    }

    public void inthongtin() {
        System.out.println("hovaten: " + hovaten);
        System.out.println("tuoi: " + tuoi);
        System.out.println("quequan: " + quequan);
    }

}
