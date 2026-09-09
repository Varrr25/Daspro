import java.util.Scanner;

public class tugas1_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double hargaLaptop, uangMuka, lamaCicilan;
        double sisaHarga, bunga, totalCicilan, cicilanPerBulan;

        System.out.print("Harga laptop = ");
        hargaLaptop = sc.nextDouble();

        System.out.print("Uang muka = ");
        uangMuka = sc.nextDouble();

        System.out.print("Lama cicilan (bulan) = ");
        lamaCicilan = sc.nextDouble();

        sisaHarga = hargaLaptop - uangMuka;
        bunga = 0.02 * sisaHarga;
        totalCicilan = sisaHarga + bunga;
        cicilanPerBulan = totalCicilan / lamaCicilan;

        System.out.println("Sisa harga = " + sisaHarga);
        System.out.println("Bunga 2% = " + bunga);
        System.out.println("Total cicilan = " + totalCicilan);
        System.out.println("Cicilan per bulan = " + cicilanPerBulan);
    }
}