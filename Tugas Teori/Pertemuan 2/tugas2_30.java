import java.util.Scanner;

public class tugas2_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi variabel
        double panjangTanah, lebarTanah, diameterKolam, sisiTaman, luasTanah, jariJari, luasKolam, luasTaman, luasSisa;

        // Input
        System.out.print("Masukkan panjang tanah (m): ");
        panjangTanah = input.nextDouble();

        System.out.print("Masukkan lebar tanah (m): ");
        lebarTanah = input.nextDouble();

        System.out.print("Masukkan diameter kolam ikan (m): ");
        diameterKolam = input.nextDouble();

        System.out.print("Masukkan sisi taman bunga (m): ");
        sisiTaman = input.nextDouble();

        // Proses
        luasTanah = panjangTanah * lebarTanah;
        jariJari = diameterKolam / 2;
        luasKolam = Math.PI * jariJari * jariJari;
        luasTaman = sisiTaman * sisiTaman;
        luasSisa = luasTanah - luasKolam - luasTaman;

        // Output
        System.out.println("Luas tanah keseluruhan : " + luasTanah + " m2");
        System.out.println("Luas kolam ikan         : " + luasKolam + " m2");
        System.out.println("Luas taman bunga        : " + luasTaman + " m2");
        System.out.println("Luas tanah tidak digunakan: " + luasSisa + " m2");

        input.close();
    }
}

/* 1. Menentukan Algoritma
    - Input: lebar tanah, panjang tanah, diameter kolam, sisi taman
    - Output: luas tanah yang tidak digunakan
    - Data lain:
        - phi = 3,14

    - Proses:
        - Input lebar tanah, panjang tanah, diameter kolam, dan sisi taman
        - Hitung luas tanah = lebar tanah x panjang tanah
        - Hitung jari-jari kolam = diameter kolam / 2
        - Hitung luas kolam = phi x jari-jari x jari-jari
        - Hitung luas taman = sisi taman x sisi taman
        - Hitung luas tanah yang digunakan = luas kolam + luas taman
        - Hitung luas tanah yang tidak digunakan = luas tanah - luas tanah yang digunakan
        - Output luas tanah yang tidak digunakan

2. Mengindentifikasi variable dan jenis tipe data berdasarkan algoritma

    Variabel              tipe data
    - lebarTanah          = double
    - panjangTanah        = double
    - diameterKolam       = double
    - sisiTaman            = double
    - phi                  = double
    - jariJariKolam        = double
    - luasTanah            = double
    - luasKolam            = double
    - luasTaman            = double
    - luasDigunakan        = double
    - luasTidakDigunakan   = double
*/