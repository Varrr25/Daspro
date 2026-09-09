import java.util.Scanner;

public class GajiKaryawan30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int gajiPokok;
        double bonus, totGaji, tunjTransp=600000, tunjMkn=400000;

        System.out.print("Gaji Pokok = ");
        gajiPokok=sc.nextInt();

        bonus=0.05*gajiPokok;
        totGaji=gajiPokok+tunjTransp+tunjMkn+bonus-(0.1*gajiPokok);
        System.out.println("Bonus = "+ bonus);
        System.out.print("Total gaji = " + (int) totGaji);
    }
}
