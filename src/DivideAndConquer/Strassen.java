package DivideAndConquer;

public class Strassen {
    public static int[][] strassenMultiply(int[][] A, int[][] B) {
        int n = A.length;
        if (n == 1) {
            int[][] result = new int[1][1];
            result[0][0] = A[0][0] * B[0][0];
            return result;
        }

        int mid = n / 2;
        int[][] A11 = new int[mid][mid];
        int[][] A12 = new int[mid][mid];
        int[][] A21 = new int[mid][mid];
        int[][] A22 = new int[mid][mid];
        int[][] B11 = new int[mid][mid];
        int[][] B12 = new int[mid][mid];
        int[][] B21 = new int[mid][mid];
        int[][] B22 = new int[mid][mid];

        splitMatrix(A, A11, A12, A21, A22);
        splitMatrix(B, B11, B12, B21, B22);

        int[][] M1 = strassenMultiply(add(A11, A22), add(B11, B22));
        int[][] M2 = strassenMultiply(add(A21, A22), B11);
        int[][] M3 = strassenMultiply(A11, subtract(B12, B22));
        int[][] M4 = strassenMultiply(A22, subtract(B21, B11));
        int[][] M5 = strassenMultiply(add(A11, A12), B22);
        int[][] M6 = strassenMultiply(subtract(A21, A11), add(B11, B12));
        int[][] M7 = strassenMultiply(subtract(A12, A22), add(B21, B22));

        int[][] C11 = add(subtract(add(M1, M4), M5), M7);
        int[][] C12 = add(M3, M5);
        int[][] C21 = add(M2, M4);
        int[][] C22 = add(subtract(add(M1, M3), M2), M6);

        int[][] result = new int[n][n];
        joinMatrix(C11, C12, C21, C22, result);
        return result;
    }

    private static void splitMatrix(int[][] A, int[][] A11, int[][] A12, int[][] A21, int[][] A22) {
        int n = A.length;
        int mid = n / 2;
        for (int i = 0; i < mid; i++) {
            for (int j = 0; j < mid; j++) {
                A11[i][j] = A[i][j];
                A12[i][j] = A[i][j + mid];
                A21[i][j] = A[i + mid][j];
                A22[i][j] = A[i + mid][j + mid];
            }
        }
    }

    private static void joinMatrix(int[][] C11, int[][] C12, int[][] C21, int[][] C22, int[][] result) {
        int n = C11.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = C11[i][j];
                result[i][j + n / 2] = C12[i][j];
                result[i + n / 2][j] = C21[i][j];
                result[i + n / 2][j + n / 2] = C22[i][j];
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

    public static void runStrassen(int[][] A, int[][] B) {


        int[][] result = strassenMultiply(A, B);
        // Print the result matrix
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
