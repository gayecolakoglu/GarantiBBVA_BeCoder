import java.util.Scanner;

public class DaireAlanCevreHesaplayici {
    public static void main(String[] args) {
        final double PI = 3.14;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını (r) girin: ");
        double yariCap = scanner.nextDouble();

        double alan = PI * yariCap * yariCap;
        double cevre = 2 * PI * yariCap;

        System.out.println("Dairenin Alanı: " + alan);
        System.out.println("Dairenin Çevresi: " + cevre);

        scanner.close();
    }
}
