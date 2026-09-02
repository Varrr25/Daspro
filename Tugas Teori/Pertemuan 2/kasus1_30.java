import java.util.Scanner;

public class kasus1_30 {

    public static void main (String [] args){
        Scanner input = new Scanner (System.in);

        int panjang, lebar, keliling;

        System.out.println("Panjang : ");
        panjang = input.nextInt();

        System.out.println("Lebar : ");
        lebar = input.nextInt();

        keliling = 2 * (panjang + lebar);

        System.out.println("Keliling : " +keliling);
    }
}

/*1. Menentukan Algoritma
- Input: panjang, lebar
- Output: keliling
- Proses:
a. input panjang, lebar
b. kelililing = 2 x (panjang + lebar)
c. Output keliling
2. Mengindentifikasi variable dan jenis tipe data berdasarkan algoritma
    Variabel    tipe data
    - Panjang = int
    -lebar    = int
    -keliling = int
*/