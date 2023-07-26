import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tabanı giriniz: ");
        int base = scanner.nextInt();

        System.out.print("Üs değerini giriniz: ");
        int exponent = scanner.nextInt();

        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println(base + " üzeri " + exponent + " = " + result);

        scanner.close();
    }
}
