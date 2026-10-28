
import java.util.Scanner;

public class latihan4_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlahProduk;
        int jumlahHari;

        do {
            System.out.print("Masukkan jumlah produk: ");
            jumlahProduk = input.nextInt();

            if (jumlahProduk < 1) {
                System.out.println("Jumlah produk minimal 1!");
            }
        } while (jumlahProduk < 1);

        do {
            System.out.print("Masukkan jumlah hari: ");
            jumlahHari = input.nextInt();

            if (jumlahHari < 1) {
                System.out.println("Jumlah hari minimal 1!");
            }
        } while (jumlahHari < 1);

        int produk = 1;
        int totalSeluruhProduk = 0;

        while (produk <= jumlahProduk) {
            int totalProduk = 0;

            System.out.println("\nProduk ke-" + produk);

            for (int hari = 1; hari <= jumlahHari; hari++) {
                int terjual;

                do {
                    System.out.print("Jumlah terjual hari ke-"
                            + hari + ": ");
                    terjual = input.nextInt();

                    if (terjual < 0) {
                        System.out.println(
                                "Jumlah terjual tidak boleh negatif!");
                    }
                } while (terjual < 0);

                totalProduk += terjual;
            }

            double rataRata = (double) totalProduk / jumlahHari;

            System.out.println("Total penjualan produk ke-"
                    + produk + ": " + totalProduk);
            System.out.println("Rata-rata penjualan per hari: "
                    + rataRata);

            totalSeluruhProduk += totalProduk;
            produk++;
        }

        System.out.println("\nTotal seluruh produk: "
                + totalSeluruhProduk);

        input.close();
    }
}
