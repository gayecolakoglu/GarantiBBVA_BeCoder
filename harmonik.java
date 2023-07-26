import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int n = input.nextInt();

        double harmonicSum = 0;

        for (int i = 1; i <= n; i++) {
            harmonicSum += 1.0 / i;
        }

        System.out.println(n + " sayısının harmonik serisi: " + harmonicSum);
    }
}
