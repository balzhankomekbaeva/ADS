public class Task7 {
    public static void printSpiralSquare(int n, int num, int row, int col, int size, int[][] square) {
        if (num > n * n) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print(square[i][j] + " ");
                }
                System.out.println();
            }
            return;
        }

        while (col < size && square[row][col] == 0) {
            square[row][col] = num++;
            col++;
        }
        col--;
        row++;

        while (row < size && square[row][col] == 0) {
            square[row][col] = num++;
            row++;
        }
        row--;
        col--;

        while (col >= 0 && square[row][col] == 0) {
            square[row][col] = num++;
            col--;
        }
        col++;
        row--;

        while (row >= 0 && square[row][col] == 0) {
            square[row][col] = num++;
            row--;
        }
        row++;
        col++;

        printSpiralSquare(n, num, row, col, size, square);
    }
}
