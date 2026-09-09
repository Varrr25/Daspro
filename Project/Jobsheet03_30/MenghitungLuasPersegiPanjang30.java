import java.util.Scanner;

public class MenghitungLuasPersegiPanjang30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int panjang, lebar, luas;
        
        System.out.print("Panjang = ");
        panjang=sc.nextInt();

        System.out.print("Lebar = ");
        lebar=sc.nextInt();

        luas = panjang*lebar;
        System.out.println("Luasnya = " +luas);
    }
}
