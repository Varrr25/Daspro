import java.util.Scanner;

public class tugas2_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlLembar, biayaCetak, totalBiaya;

        System.out.print("Jumlah lembar = ");
        jmlLembar = sc.nextInt();

        biayaCetak = jmlLembar * 500;
        totalBiaya = biayaCetak + 5000;

        System.out.println("Biaya cetak = Rp" + biayaCetak);
        System.out.println("Biaya penjilidan = Rp5000");
        System.out.println("Total biaya = Rp" + totalBiaya);
    }
}