public class Main {
    public static void main(String[] args) {
        String[][] letterB = new String[7][4];

        for (int i = 0; i < letterB.length; i++) {
            for (int j = 0; j < letterB[i].length; j++) {
                if (j == 0 || (i == 0 || i == 3 || i == 6) && j < 3 || j == 3 && (i != 0 && i != 3 && i != 6)) {
                    letterB[i][j] = "*";
                } else {
                    letterB[i][j] = " ";
                }
            }
        }

        for (String[] row : letterB) {
            for (String col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
