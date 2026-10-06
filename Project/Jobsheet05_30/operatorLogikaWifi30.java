import java.util.Scanner;

public class operatorLogikaWifi30{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        boolean mahasiswa, dosen, akunDiblokie;

        System.out.print("Apakah pengguna mahasiswa? (true/false) : ");
        mahasiswa = sc.nextBoolean();
        System.out.print("Apakah pengguna dosen? (true/false) : ");
        dosen = sc.nextBoolean();
        System.out.print("Apakah akun diblokir? (true/false) : ");
        akunDiblokie = sc.nextBoolean();

        if((mahasiswa || dosen) && !akunDiblokie){
            System.out.println("Akun Wifi diberikan");
        } else{
            System.out.println("Akun Wifi ditolak");
        }
    }
}