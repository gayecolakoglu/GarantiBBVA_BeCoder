import java.util.Scanner;

public class KDVTutariHesaplayici {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("KDV'siz tutarınızı girin: ");
        double kdvSizTutar = scanner.nextDouble();

        double kdvOrani;

        if (kdvSizTutar <= 1000) {
            kdvOrani = 0.18; // %18 KDV
        } else {
            kdvOrani = 0.08; // %8 KDV
        }

        double kdvTutari = kdvSizTutar * kdvOrani;
        double kdvliFiyat = kdvSizTutar + kdvTutari;

        System.out.println("KDV'siz Fiyat: " + kdvSizTutar);
        System.out.println("KDV'li Fiyat: " + kdvliFiyat);
        System.out.println("KDV Tutarı: " + kdvTutari);

        scanner.close();
    }
}
