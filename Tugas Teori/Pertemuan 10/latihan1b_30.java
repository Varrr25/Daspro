public class latihan1b_30 {
    public static void main(String[] args) {
        int baris = 10;

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < baris - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}