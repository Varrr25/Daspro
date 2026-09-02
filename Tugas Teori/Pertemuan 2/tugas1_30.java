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

/* 1. Menentukan Algoritma
    - Input: gaji pokok, jumlah anak
    - Output: tunjangan anak, potongan dana pensiun, gaji bersih
    - Data lain:
        - tunjangan per anak = Rp. 100.000
        - persentase dana pensiun = 10%

    - Proses:
        - Input gaji pokok dan jumlah anak
        - Hitung tunjangan anak = jumlah anak x tunjangan per anak
        - Hitung potongan dana pensiun = 10% x gaji pokok
        - Hitung gaji bersih = gaji pokok + tunjangan anak - potongan dana pensiun
        - Output tunjangan anak, potongan dana pensiun, dan gaji bersih

2. Mengindentifikasi variable dan jenis tipe data berdasarkan algoritma

    Variabel              tipe data
    - gajiPokok           = double
    - jumlahAnak          = int
    - tunjanganPerAnak    = double
    - persentasePensiun   = double
    - tunjanganAnak       = double
    - potonganPensiun     = double
    - gajiBersih          = double
    */