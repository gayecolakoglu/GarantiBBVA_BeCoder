import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int n = scanner.nextInt();

        int sum = 0; // Toplamı tutmak için değişken
        int count = 0; // Bölünebilen sayı adedini tutmak için değişken

        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sum += i; // 3 ve 4'e tam bölünen sayıları topluyoruz
                count++; // 3 ve 4'e tam bölünen sayı adedini arttırıyoruz
            }
        }

        if (count == 0) {
            System.out.println("Girilen aralıkta 3 ve 4'e tam bölünen bir sayı bulunamadı.");
        } else {
            double average = (double) sum / count; // Ortalamayı hesaplıyoruz
            System.out.println("3 ve 4'e tam bölünen sayıların ortalaması: " + average);
        }

        scanner.close();
    }
}
