package DynamicProgramming;

public class MatrixChainMultiplication {
    public static int matrixChainOrder(int[] p) {
        int n = p.length - 1;
        int[][] dp = new int[n][n];

        for (int len = 2; len <= n; len++) {
            for (int i = 0; i < n - len + 1; i++) {
                int j = i + len - 1;
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = i; k < j; k++) {
                    int cost = dp[i][k] + dp[k + 1][j] + p[i] * p[k + 1] * p[j + 1];
                    dp[i][j] = Math.min(dp[i][j], cost);
                }
            }
        }

        return dp[0][n - 1];
    }

    public static void runMatrixChainMultiplication(int[] dimensions) {
        System.out.println("Minimum cost: " + matrixChainOrder(dimensions)); // Output: minimum cost
    }
}
