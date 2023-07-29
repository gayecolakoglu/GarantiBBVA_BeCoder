public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double harmonicSeries = 0.0;
        
        // Harmonik seriyi hesapla
        for (int i = 0; i < numbers.length; i++) {
            harmonicSeries += 1.0 / numbers[i];
        }
        
        // Eleman sayısını bul
        int n = numbers.length;
        
        // Harmonik ortalamayı hesapla
        double harmonicAverage = n / harmonicSeries;
        
        System.out.println("Harmonik Ortalama: " + harmonicAverage);
    }
}
