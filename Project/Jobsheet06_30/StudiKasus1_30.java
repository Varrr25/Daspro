import java.util.Scanner;

public class StudiKasus1_30{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaPerCup = 18000, 
            jumlahCup, uangBayar,
            totalHarga, diskon, totalBayar,
            kembalian, kurang;

        System.out.print("Berapa cup yang dibeli : ");
        jumlahCup = sc.nextInt();
        System.out.print("Uang yang dibayarkan : ");
        uangBayar = sc.nextInt();

        totalHarga = hargaPerCup * jumlahCup;
        diskon = 0;

        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
        }

        totalBayar = totalHarga - diskon;
        System.out.println("Total harga : " + totalHarga);
        System.out.println("Diskon : " + diskon);
        System.out.println("Total bayar : " + totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian : " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang anda kurang : " + kurang);
        }
    }
}