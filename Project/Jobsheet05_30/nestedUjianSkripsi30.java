import java.util.Scanner;

public class nestedUjianSkripsi30 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String pesan;

        System.out.print("Apakah mahasiswa sudah bebas kompen? (ya/tidak) : ");
        String bebasKompen = sc.nextLine();
        System.out.print("Masukkan jumlah log bimbingan pembimbing 1 : ");
        int bimbinganP1 = sc.nextInt();
        System.out.print("Masukkan jumlah log bimbingan pembimbing 2 : ");
        int bimbinganP2 = sc.nextInt();

        if(bebasKompen.equalsIgnoreCase("Ya")){
            if(bimbinganP1 >= 8 && bimbinganP2 >= 4){
                System.out.println("Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi");
            } else if(bimbinganP1 < 8 && bimbinganP2 < 4){
                System.out.println("Gagal! Log bimbingan P1 kurang dari 8 kali dan P2 kurang dari 4 kali");
            } else if(bimbinganP1 <8){
                System.out.println("Gagal! Log bimbingan P1 belum mencapai 8 kali");
            } else{
                System.out.println("Gagal! Log bimbingan P2 belum mencapai 4 kali");
            }
        } else{
            System.out.println("Gagal! mahasiswa masih memiliki tanggungan kompen");
        }
    }
}