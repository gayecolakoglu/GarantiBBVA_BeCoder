import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("N elemanını giriniz: ");
        int n = scanner.nextInt();

        System.out.print("R elemanını giriniz: ");
        int r = scanner.nextInt();

        int result = combination(n, r);
        System.out.println("C(" + n + "," + r + ") = " + result);

        scanner.close();
    }

    public static int combination(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    public static int factorial(int num) {
        if (num == 0)
            return 1;
        else
            return num * factorial(num - 1);
    }
}
