import java.util.Scanner;

public class RecursiveLoop {
    
    static void recursive(int n, int step) {
        System.out.print(n + " ");
        if (n <= 0) {
            if (n == 0) {
                recursive(n + 5, -5); // Negatif değilse 5 çıkararak devam et
            } else {
                return;
            }
        } else {
            recursive(n - 5, -5); // Negatif veya 0 olduğunda 5 ekleyerek devam et
        }
        if (n != step) {
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("N Sayısı: ");
        int n = scan.nextInt();

        recursive(n, -n);
    }
}
