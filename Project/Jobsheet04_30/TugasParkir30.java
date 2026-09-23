import java.util.Scanner;

public class TugasParkir30{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int lamaParkir, total;

        System.out.print("Berapa lama parkir : ");
        lamaParkir=sc.nextInt();

        if (lamaParkir <= 2){
            total = 2000;
        } else {
            total = 2000 + (lamaParkir - 2) * 1000;
        }
        System.out.print("Total : " +total);
    }
}