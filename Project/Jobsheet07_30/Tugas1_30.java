import java.util.Scanner;

public class Tugas1_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaTiket = 50000, totalTiket = 0, jumlahTiket, totalPenjualan = 0;
        double diskon, totalBayar;

        while (true) {
            System.out.print("Masukkan jumlah tiket yang ingin dibeli (ketik 0 untuk keluar): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket == 0) {
                System.out.println("Transaksi dibatalkan.");
                System.out.println("");
                break;
            }

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Silakan masukkan jumlah tiket yang benar.");
                System.out.println("");
                continue;
            }

            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.1;
            } else {
                diskon = 0;
            }

            totalBayar = jumlahTiket * hargaTiket;
            totalBayar = totalBayar - (totalBayar * diskon);

            totalPenjualan += totalBayar;
            totalTiket += jumlahTiket;

            System.out.println("Total diskon : " + (diskon * 100) + "%");
            System.out.println("Total yang harus dibayar : Rp " + totalBayar);
            System.out.println("");
        }
        System.out.println ("==Rekap Penjualan Tiket==");
        System.out.println("Total tiket terjual : " + totalTiket);
        System.out.println("Total penjualan : Rp " + totalPenjualan);
    }
}