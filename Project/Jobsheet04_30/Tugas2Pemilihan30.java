import java.util.Scanner;

public class Tugas2pemilihan30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int jumlahSks;
        System.out.println("Berapa jumlah SKS kamu?");
        jumlahSks = scanner.nextInt();

        if (jumlahSks > 24) {
            System.out.println("SKS kamu melebihi batas");
        } else {
            System.out.println("KRS Valid");
        }
    }   
}