package Backtracking;

public class NQueens {

    private static boolean isSafe(int board[][], int row, int col, int n) {
        for (int i = 0; i < col; i++) {
            if (board[row][i] == 1)
                return false;
        }

        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1)
                return false;
        }

        for (int i = row, j = col; j >= 0 && i < n; i++, j--) {
            if (board[i][j] == 1)
                return false;
        }

        return true;
    }

    private static boolean solveNQUtil(int board[][], int col, int n) {
        if (col >= n) {
            return true;
        }

        for (int i = 0; i < n; i++) {
            if (isSafe(board, i, col, n)) {
                board[i][col] = 1;

                if (solveNQUtil(board, col + 1, n))
                    return true;

                board[i][col] = 0;
            }
        }

        return false;
    }

    public static void solveNQ(int n) {
        int board[][] = new int[n][n];

        if (!solveNQUtil(board, 0, n)) {
            System.out.println("Solution does not exist");
            return;
        }

        printSolution(board, n);
    }

    private static void printSolution(int board[][], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void runNQueens(int n) {
        solveNQ(n);
    }
}
