import java.util.Scanner;

public class Tugas1Pemilihan30{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT Sudah Lunas? (True/False): ");
        boolean uktLunas = scanner.nextBoolean();

        String pesan = uktLunas
        ? "Pembayaran UKT terverivikasi\nSilahkan cetak KRS dan minta tanda tangan DPA"
        : "";

         System.out.println(pesan);
    }
}