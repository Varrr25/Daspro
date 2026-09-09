import java.util.Scanner;

public class MenghitungTotalBayar30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double harga;
        double potongan, jml_bayar, diskon = 0.15;

        System.out.print("Harga = ");
        harga = sc.nextDouble();

        potongan = diskon * harga;
        System.out.println("Potongan = " + potongan);

        jml_bayar = harga - potongan;
        System.out.println("Jumlah yang harus di bayar = " + jml_bayar);
    }
}