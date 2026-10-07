import java.util.Scanner;

public class StudiKasus2_30{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, jenisKegiatan;
        int jumlahDokumen, peringkat, statusPendanan, dokumenKurang;

        System.out.print("Masukkan nama anda : ");
        nama = sc.nextLine();
        System.out.print("Masukkan jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        jenisKegiatan = sc.nextLine();

        if(jenisKegiatan.equalsIgnoreCase("BELMAWA") || jenisKegiatan.equalsIgnoreCase("BAKORMA") || jenisKegiatan.equalsIgnoreCase("MANDIRI")){
            System.out.print("Masukkan jumlah dokumen yang dikumpulkan (0-4) : ");
            jumlahDokumen = sc.nextInt();
            System.out.print("Masukkan peringkat : ");
            peringkat = sc.nextInt();

            if(peringkat >= 1 && peringkat <= 3){
                if(jumlahDokumen == 4){
                    System.out.println("Status : Dokumen Lengkap. Dana Penghargaan diberikan");
                } else {
                    dokumenKurang = 4 - jumlahDokumen;
                    System.out.println("Status : Dokumen Kurang (kurang " + dokumenKurang + "dokumen). Dana Penghargaan tidak diberikan");
                }
            } else {
                System.out.println("Status : Peringkat tidak memenuhi syarat. Dana Penghargaan tidak diberikan");
            }
        } else if(jenisKegiatan.equalsIgnoreCase("PKM")){
            System.out.print("Status pendanaan PKM (1=Lolos, 0=Tidak Lolos) : ");
            statusPendanan = sc.nextInt();
            if(statusPendanan == 1){
                System.out.print("Masukkan jumlah dokumen yang dikumpulkan (0-4) : ");
                jumlahDokumen = sc.nextInt();
                if(jumlahDokumen == 4){
                    System.out.println("Status : Dokumen Lengkap. Dana Penghargaan diberikan");
                } else {
                    dokumenKurang = 4 - jumlahDokumen;
                    System.out.println("Status : Dokumen Kurang (kurang " + dokumenKurang + " dokumen). Dana Penghargaan tidak diberikan");
                }
            } else {
                System.out.println("Status : Tidak Lolos Pendanaan PKM. Dana Penghargaan tidak diberikan");
            }
        } else {
            System.out.println("Status : Kegiatan lainnya tidak tidak memperoleh Dana Penghargaan");
        }
    }
}