import java.util.Scanner;

public class tugas1_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi variabel
        double gajiPokok, tunjanganPerAnak = 100000, persenPensiun = 0.10, totalTunjangan, potonganPensiun, gajiBersih;
        int jumlahAnak;

        // Input
        System.out.print("Masukkan gaji pokok: ");
        gajiPokok = input.nextDouble();

        System.out.print("Masukkan jumlah anak: ");
        jumlahAnak = input.nextInt();

        // Proses
        totalTunjangan = jumlahAnak * tunjanganPerAnak;
        potonganPensiun = persenPensiun * gajiPokok;
        gajiBersih = gajiPokok + totalTunjangan - potonganPensiun;

        // Output
        System.out.println("Total tunjangan anak : Rp" + totalTunjangan);
        System.out.println("Potongan pensiun     : Rp" + potonganPensiun);
        System.out.println("Gaji bersih Pak Danur: Rp" + gajiBersih);

        input.close();
    }
}