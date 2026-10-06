import java.util.Scanner;

public class tugas1_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String jenisBuku, hari;
        int jumlahBuku;
        double diskon = 0;

        System.out.print("Masukkan jenis buku: ");
        jenisBuku = input.nextLine();

        System.out.print("Masukkan hari :");
        hari = input.nextLine();

        System.out.print("Masukkan jumlah buku: ");
        jumlahBuku = input.nextInt();

        if (hari.equals("rabu")){

            if (jenisBuku.equals("kamus")) {

                diskon = 10;

                if (jumlahBuku > 2) {
                    diskon = diskon + 2;
                }

        } else if (jenisBuku.equalsIgnoreCase("novel")) {

            diskon = 7;

            if (jumlahBuku > 3) {
                diskon = diskon + 2;
            } else if (jumlahBuku <= 3) {
                diskon = diskon + 1;
            }

        } else{

            if (jumlahBuku > 3) {
                diskon = 5;
                }
            } 
         } else {
            System.out.print("Diskon hanya diberikan pada hari rabu");
        } 

        System.out.print("Jumlah diskon = " + diskon + "%");

    } 
}