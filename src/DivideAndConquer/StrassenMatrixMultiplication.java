package DivideAndConquer;

public class StrassenMatrixMultiplication {
    public static int[][] strassen(int[][] A, int[][] B) {
        int n = A.length;
        if (n == 1) {
            int[][] result = new int[1][1];
            result[0][0] = A[0][0] * B[0][0];
            return result;
        }

        int newSize = n / 2;
        int[][] A11 = new int[newSize][newSize];
        int[][] A12 = new int[newSize][newSize];
        int[][] A21 = new int[newSize][newSize];
        int[][] A22 = new int[newSize][newSize];
        int[][] B11 = new int[newSize][newSize];
        int[][] B12 = new int[newSize][newSize];
        int[][] B21 = new int[newSize][newSize];
        int[][] B22 = new int[newSize][newSize];

        split(A, A11, A12, A21, A22);
        split(B, B11, B12, B21, B22);

        int[][] M1 = strassen(add(A11, A22), add(B11, B22));
        int[][] M2 = strassen(add(A21, A22), B11);
        int[][] M3 = strassen(A11, subtract(B12, B22));
        int[][] M4 = strassen(A22, subtract(B21, B11));
        int[][] M5 = strassen(add(A11, A12), B22);
        int[][] M6 = strassen(subtract(A21, A11), add(B11, B12));
        int[][] M7 = strassen(subtract(A12, A22), add(B21, B22));

        int[][] C11 = add(subtract(add(M1, M4), M5), M7);
        int[][] C12 = add(M3, M5);
        int[][] C21 = add(M2, M4);
        int[][] C22 = add(subtract(add(M1, M3), M2), M6);

        int[][] result = new int[n][n];
        join(C11, C12, C21, C22, result);
        return result;
    }

    private static void split(int[][] parent, int[][] A11, int[][] A12, int[][] A21, int[][] A22) {
        int newSize = parent.length / 2;
        for (int i = 0; i < newSize; i++) {
            for (int j = 0; j < newSize; j++) {
                A11[i][j] = parent[i][j];
                A12[i][j] = parent[i][j + newSize];
                A21[i][j] = parent[i + newSize][j];
                A22[i][j] = parent[i + newSize][j + newSize];
            }
        }
    }

    private static void join(int[][] C11, int[][] C12, int[][] C21, int[][] C22, int[][] result) {
        int n = C11.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = C11[i][j];
                result[i][j + n] = C12[i][j];
                result[i + n][j] = C21[i][j];
                result[i + n][j + n] = C22[i][j];
            }
        }
    }

    private static int[][] add(int[][] A, int[][] B) {
        int n = A.length;
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }

    private static int[][] subtract(int[][] A, int[][] B) {
        int n = A.length;
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
        return result;
    }

    public static void runStrassenMatrixMultiplication(int[][] A, int[][] B) {

        int[][] result = strassen(A, B);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
