import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    private int[][] board;
    private int[][] mines;
    private int rows;
    private int cols;
    private int remainingCells;

    public MineSweeper(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        board = new int[rows][cols];
        mines = new int[rows][cols];
        remainingCells = rows * cols;
    }

    public void placeMines(int numMines) {
        Random rand = new Random();
        int placedMines = 0;

        while (placedMines < numMines) {
            int row = rand.nextInt(rows);
            int col = rand.nextInt(cols);

            if (mines[row][col] == 0) {
                mines[row][col] = 1;
                placedMines++;
            }
        }
    }

    public void printBoard() {
        for (int[] row : board) {
            for (int cell : row) {
                if (cell == -1) {
                    System.out.print("* ");
                } else {
                    System.out.print(cell + " ");
                }
            }
            System.out.println();
        }
    }

    public boolean isValid(int row, int col) {
        return row >= 0 && row < rows && col >= 0 && col < cols;
    }

    public void updateCell(int row, int col) {
        if (!isValid(row, col) || board[row][col] != 0) {
            return;
        }

        if (mines[row][col] == 1) {
            board[row][col] = -1;
            printBoard();
            System.out.println("Game Over!!");
            System.exit(0);
        } else {
            int numMines = 0;

            for (int r = row - 1; r <= row + 1; r++) {
                for (int c = col - 1; c <= col + 1; c++) {
                    if (isValid(r, c) && mines[r][c] == 1) {
                        numMines++;
                    }
                }
            }

            board[row][col] = numMines;
            remainingCells--;

            if (remainingCells == 0) {
                printBoard();
                System.out.println("Congratulations! You won!");
                System.exit(0);
            }

            if (numMines == 0) {
                for (int r = row - 1; r <= row + 1; r++) {
                    for (int c = col - 1; c <= col + 1; c++) {
                        updateCell(r, c);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        System.out.print("Enter the number of mines: ");
        int numMines = scanner.nextInt();

        MineSweeper game = new MineSweeper(rows, cols);
        game.placeMines(numMines);

        System.out.println("MineSweeper Game Starts!");
        game.printBoard();

        while (true) {
            System.out.print("Enter the row: ");
            int row = scanner.nextInt();

            System.out.print("Enter the column: ");
            int col = scanner.nextInt();

            game.updateCell(row, col);
            game.printBoard();
        }
    }
}
