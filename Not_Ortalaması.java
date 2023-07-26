import java.util.Scanner;

public class NotOrtalamasiHesaplayici {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Matematik notunuzu girin: ");
        double matematikNotu = scanner.nextDouble();

        System.out.print("Fizik notunuzu girin: ");
        double fizikNotu = scanner.nextDouble();

        System.out.print("Kimya notunuzu girin: ");
        double kimyaNotu = scanner.nextDouble();

        System.out.print("Türkçe notunuzu girin: ");
        double turkceNotu = scanner.nextDouble();

        System.out.print("Tarih notunuzu girin: ");
        double tarihNotu = scanner.nextDouble();

        System.out.print("Müzik notunuzu girin: ");
        double muzikNotu = scanner.nextDouble();

        double notOrtalamasi = (matematikNotu + fizikNotu + kimyaNotu + turkceNotu + tarihNotu + muzikNotu) / 6;

        System.out.println("Ortalamanız: " + notOrtalamasi);

        // Koşulsuz ifade kullanarak Sınıfı Geçti veya Sınıfta Kaldı durumunu belirleme
        System.out.println(notOrtalamasi >= 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı");

        scanner.close();
    }
}
