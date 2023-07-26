import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int n = scanner.nextInt();

        System.out.println("4 ve 5'in kuvvetleri:");

        for (int i = 0; i <= n; i++) {
            int powerOf4 = (int) Math.pow(4, i);
            int powerOf5 = (int) Math.pow(5, i);

            System.out.println("4^" + i + " = " + powerOf4);
            System.out.println("5^" + i + " = " + powerOf5);
        }

        scanner.close();
    }
}
