import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        final double ARMUT_FIYAT = 2.14;
        final double ELMA_FIYAT = 3.67;
        final double DOMATES_FIYAT = 1.11;
        final double MUZ_FIYAT = 0.95;
        final double PATLICAN_FIYAT = 5.00;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo? : ");
        int armutKilo = scanner.nextInt();

        System.out.print("Elma Kaç Kilo? : ");
        int elmaKilo = scanner.nextInt();

        System.out.print("Domates Kaç Kilo? : ");
        int domatesKilo = scanner.nextInt();

        System.out.print("Muz Kaç Kilo? : ");
        int muzKilo = scanner.nextInt();

        System.out.print("Patlıcan Kaç Kilo? : ");
        int patlicanKilo = scanner.nextInt();

        double toplamTutar = (armutKilo * ARMUT_FIYAT) +
                            (elmaKilo * ELMA_FIYAT) +
                            (domatesKilo * DOMATES_FIYAT) +
                            (muzKilo * MUZ_FIYAT) +
                            (patlicanKilo * PATLICAN_FIYAT);

        System.out.println("Toplam Tutar: " + toplamTutar + " TL");

        scanner.close();
    }
}
