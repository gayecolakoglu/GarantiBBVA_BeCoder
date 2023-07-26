import java.util.Scanner;
import java.util.Arrays;

public class Siralama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1. sayıyı girin: ");
        int a = scanner.nextInt();

        System.out.print("2. sayıyı girin: ");
        int b = scanner.nextInt();

        System.out.print("3. sayıyı girin: ");
        int c = scanner.nextInt();

        int[] sayilar = {a, b, c};
        Arrays.sort(sayilar);

        a = sayilar[2];
        b = sayilar[1];
        c = sayilar[0];

        System.out.println(a + " > " + b + " > " + c);
    }
}
