import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = input.nextInt();

        if (isPalindrome(number)) {
            System.out.println(number + " palindrom bir sayıdır.");
        } else {
            System.out.println(number + " palindrom bir sayı değildir.");
        }
    }

    static boolean isPalindrome(int num) {
        int originalNumber = num;
        int reverseNumber = 0;

        while (num != 0) {
            int lastDigit = num % 10;
            reverseNumber = reverseNumber * 10 + lastDigit;
            num /= 10;
        }

        return originalNumber == reverseNumber;
    }
}
