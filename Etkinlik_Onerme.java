import java.util.Scanner;

public class HavaSicakligi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hava sıcaklığını girin: ");
        int sicaklik = scanner.nextInt();

        switch (sicaklik) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Kayak yapabilirsiniz.");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                System.out.println("Sinemaya gidebilirsiniz.");
                break;
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                System.out.println("Pikniğe gidebilirsiniz.");
                break;
            default:
                System.out.println("Yüzmeye gidebilirsiniz.");
                break;
        }
    }
}
