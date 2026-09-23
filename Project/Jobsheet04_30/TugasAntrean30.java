import java.util.Scanner;

public class TugasAntrean30{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int kode;

        System.out.print("Kode : ");
        kode = sc.nextInt();

        switch (kode){
            case 1: 
            System.out.println("Layanan : Legalisir Ijasah");
            System.out.println("Loket : A");
            break;
            case 2:
            System.out.println("Layanan : Surat Keterangan Aktif Kuliah");
            System.out.println("Loket : B");
            break;
            case 3:
            System.out.println("Layanan : Pembayaran UKT");
            System.out.println("Loket : C");
            break;
            case 4:
            System.out.println("Layanan : Pengajuan Cuti Akademik");
            System.out.println("Loket : D");
            break;
            default:
            System.out.println("Kode tidak valid");
        }
    }
}