import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Dizideki elemanların frekansını hesapla ve frequencyMap'e kaydet
        for (int num : arr) {
            if (frequencyMap.containsKey(num)) {
                frequencyMap.put(num, frequencyMap.get(num) + 1);
            } else {
                frequencyMap.put(num, 1);
            }
        }

        // Sonuçları ekrana yazdır
        for (int num : frequencyMap.keySet()) {
            System.out.println(num + " sayısı " + frequencyMap.get(num) + " kere tekrar edildi.");
        }
    }
}
