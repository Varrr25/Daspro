import java.util.Scanner;
public class tugas2_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;

        System.out.print("Masukkan nilai n : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i * j + "    ");
                total += i * j;
            }
            System.out.println();
        }
        System.out.println("Total : " + total);
        sc.close();
    }
}
