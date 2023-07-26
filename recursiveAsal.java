import java.util.Scanner;

public class RecursiveAsalSayi {

    static boolean isAsal(int num, int div) {
        if (num <= 2) {
            return (num == 2) ? true : false;
        }
        if (num % div == 0) {
            return false;
        }
        if (div * div > num) {
            return true;
        }
        return isAsal(num, div + 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int sayi = scan.nextInt();

        if (isAsal(sayi, 2)) {
            System.out.println(sayi + " sayısı ASALDIR !");
        } else {
            System.out.println(sayi + " sayısı ASAL değildir !");
        }
    }
}
