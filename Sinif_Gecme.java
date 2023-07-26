import java.util.Scanner;

public class NotHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Matematik notunuzu girin: ");
        double matNotu = scanner.nextDouble();

        System.out.print("Fizik notunuzu girin: ");
        double fizikNotu = scanner.nextDouble();

        System.out.print("Türkçe notunuzu girin: ");
        double turkceNotu = scanner.nextDouble();

        System.out.print("Kimya notunuzu girin: ");
        double kimyaNotu = scanner.nextDouble();

        System.out.print("Müzik notunuzu girin: ");
        double muzikNotu = scanner.nextDouble();

        int toplamNotSayisi = 0;
        double toplamNot = 0.0;

        if (matNotu >= 0 && matNotu <= 100) {
            toplamNotSayisi++;
            toplamNot += matNotu;
        }

        if (fizikNotu >= 0 && fizikNotu <= 100) {
            toplamNotSayisi++;
            toplamNot += fizikNotu;
        }

        if (turkceNotu >= 0 && turkceNotu <= 100) {
            toplamNotSayisi++;
            toplamNot += turkceNotu;
        }

        if (kimyaNotu >= 0 && kimyaNotu <= 100) {
            toplamNotSayisi++;
            toplamNot += kimyaNotu;
        }

        if (muzikNotu >= 0 && muzikNotu <= 100) {
            toplamNotSayisi++;
            toplamNot += muzikNotu;
        }

        double ortalama = toplamNot / toplamNotSayisi;

        if (toplamNotSayisi == 0) {
            System.out.println("Girilen ders notları 0 veya 100 arasında değil, ortalama hesaplanamadı.");
        } else {
            if (ortalama >= 55) {
                System.out.println("Tebrikler, sınıfı geçtiniz!");
            } else {
                System.out.println("Sınıfta kaldınız, seneye tekrar görüşmek üzere.");
            }

            System.out.println("Ortalama: " + ortalama);
        }
    }
}
