import java.util.Scanner;

public class CinZodyagiHesaplama {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Doğum Yılınızı Giriniz: ");
        int dogumYili = scanner.nextInt();

        String[] zodyaklar = {
            "Maymun", "Horoz", "Köpek", "Domuz",
            "Fare", "Öküz", "Tiger", "Tavşan",
            "Ejderha", "Yılan", "At", "Koyun"
        };

        int zodyakIndeks = dogumYili % 12;
        String cinZodyagi = zodyaklar[zodyakIndeks];

        System.out.println("Çin Zodyağı Burcunuz: " + cinZodyagi);

        scanner.close();
    }
}
