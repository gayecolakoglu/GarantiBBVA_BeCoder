import java.util.Scanner;

public class TaksimetreProgrami {
    public static void main(String[] args) {
        final double KM_BASINA_UCRET = 2.20;
        final double ACILIS_UCRETI = 10.00;
        final double MINIMUM_UCRET = 20.00;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Gidilen mesafeyi (KM cinsinden) girin: ");
        double mesafe = scanner.nextDouble();

        double tutar = ACILIS_UCRETI + mesafe * KM_BASINA_UCRET;

        // Minimum ödenecek tutar kontrolü
        if (tutar < MINIMUM_UCRET) {
            tutar = MINIMUM_UCRET;
        }

        System.out.println("Taksimetre tutarı: " + tutar + " TL");

        scanner.close();
    }
}
