import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0; // Toplamı tutmak için değişken

        while (true) {
            System.out.print("Bir sayı giriniz (Çıkmak için 0 yazabilirsiniz): ");
            int number = scanner.nextInt();

            if (number == 0) {
                break; // 0 girildiğinde döngüyü sonlandırır
            }

            if (number % 2 == 0 && number % 4 == 0) {
                sum += number; // Çift ve 4'ün katı olan sayıları topluyoruz
            }
        }

        System.out.println("Girilen çift ve 4'ün katı olan sayıların toplamı: " + sum);

        scanner.close();
    }
}
