import java.util.Scanner;

public class RecursiveUsHesaplama {

    static int usAlma(int taban, int us) {
        if (us == 0) {
            return 1;
        } else {
            return taban * usAlma(taban, us - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz: ");
        int taban = scan.nextInt();
        System.out.print("Üs değerini giriniz: ");
        int us = scan.nextInt();

        int sonuc = usAlma(taban, us);
        System.out.println("Sonuç: " + sonuc);
    }
}
