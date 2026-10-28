
public class latihan3_30 {
    public static void main(String[] args) {
        int n = 5;
        int jumlah = 0;

        for (int i = 1; i <= n; i++) {
            int kuadrat = 0;

            for (int j = 1; j <= i; j++) {
                kuadrat += i;
            }

            jumlah += kuadrat;

            System.out.print("n = " + i + " → jumlah kuadrat = ");

            for (int k = 1; k <= i; k++) {
                System.out.print(k * k);

                if (k < i) {
                    System.out.print(" + ");
                }
            }

            System.out.println(" = " + jumlah);
        }
    }
}
