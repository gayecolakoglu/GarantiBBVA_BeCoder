import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {2, 5, 6, 8, 3, 6, 2, 4, 10, 8};
        findDuplicateEvenNumbers(numbers);
    }

    public static void findDuplicateEvenNumbers(int[] arr) {
        Map<Integer, Integer> numberCountMap = new HashMap<>();

        for (int num : arr) {
            if (num % 2 == 0) {
                if (numberCountMap.containsKey(num)) {
                    numberCountMap.put(num, numberCountMap.get(num) + 1);
                } else {
                    numberCountMap.put(num, 1);
                }
            }
        }

        boolean hasDuplicates = false;
        System.out.println("Tekrar Eden Çift Sayılar:");
        for (Map.Entry<Integer, Integer> entry : numberCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
                hasDuplicates = true;
            }
        }

        if (!hasDuplicates) {
            System.out.println("Tekrar eden çift sayı bulunmamaktadır.");
        }
    }
}
