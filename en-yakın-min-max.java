import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        int targetNumber = 5;

        int closestSmaller = findClosestSmaller(list, targetNumber);
        int closestLarger = findClosestLarger(list, targetNumber);

        System.out.println("Girilen Sayı: " + targetNumber);
        System.out.println("Girilen sayıdan küçük en yakın sayı: " + closestSmaller);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + closestLarger);
    }

    public static int findClosestSmaller(int[] list, int target) {
        Arrays.sort(list);
        int closestSmaller = list[0];

        for (int num : list) {
            if (num < target) {
                closestSmaller = num;
            } else {
                break;
            }
        }

        return closestSmaller;
    }

    public static int findClosestLarger(int[] list, int target) {
        Arrays.sort(list);
        int closestLarger = list[list.length - 1];

        for (int i = list.length - 1; i >= 0; i--) {
            if (list[i] > target) {
                closestLarger = list[i];
            } else {
                break;
            }
        }

        return closestLarger;
    }
}
