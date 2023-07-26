import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Fibonacci Serisi Eleman Sayısı: ");
        int n = scanner.nextInt();
        scanner.close();

        int first = 0;
        int second = 1;

        System.out.print("Fibonacci Serisi: ");
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");

            int sum = first + second;
            first = second;
            second = sum;
        }
    }
}
