import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı girin: ");
        String kullaniciAdi = scanner.nextLine();

        System.out.print("Şifrenizi girin: ");
        String sifre = scanner.nextLine();

        if (kullaniciAdi.equals("patika") && sifre.equals("java123")) {
            System.out.println("Giriş yaptınız!");
        } else {
            System.out.println("Bilgileriniz yanlış!");
            System.out.print("Şifrenizi sıfırlamak ister misiniz? (Evet / Hayır): ");
            String cevap = scanner.nextLine();

            if (cevap.equalsIgnoreCase("Evet")) {
                System.out.print("Yeni şifrenizi girin: ");
                String yeniSifre = scanner.nextLine();

                if (yeniSifre.equals(sifre)) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Şifre oluşturuldu!");
                }
            }
        }
    }
}
