import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("İlk sayıyı girin: ");
        double sayi1 = scanner.nextDouble();

        System.out.print("İkinci sayıyı girin: ");
        double sayi2 = scanner.nextDouble();

        System.out.println("Yapılacak işlemi seçin:");
        System.out.println("1: Toplama");
        System.out.println("2: Çıkartma");
        System.out.println("3: Çarpma");
        System.out.println("4: Bölme");
        int islem = scanner.nextInt();

        switch (islem) {
            case 1:
                double toplam = sayi1 + sayi2;
                System.out.println("Sonuç: " + toplam);
                break;
            case 2:
                double fark = sayi1 - sayi2;
                System.out.println("Sonuç: " + fark);
                break;
            case 3:
                double carpim = sayi1 * sayi2;
                System.out.println("Sonuç: " + carpim);
                break;
            case 4:
                if (sayi2 == 0) {
                    System.out.println("Hata: Sayı sıfıra bölünemez!");
                } else {
                    double bolum = sayi1 / sayi2;
                    System.out.println("Sonuç: " + bolum);
                }
                break;
            default:
                System.out.println("Yanlış işlem yaptınız!");
        }
    }
}
