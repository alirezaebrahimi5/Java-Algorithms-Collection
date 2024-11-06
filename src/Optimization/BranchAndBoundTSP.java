package Optimization;

import java.util.Arrays;

public class BranchAndBoundTSP {
    static int N;

    public static int tsp(int[][] dist) {
        N = dist.length;
        int[][] memo = new int[1 << N][N];
        for (int[] row : memo) Arrays.fill(row, -1);

        return tspUtil(0, 1, memo, dist);
    }

    private static int tspUtil(int mask, int pos, int[][] memo, int[][] dist) {
        if (mask == (1 << N) - 1) {
            return dist[pos][0];
        }

        if (memo[mask][pos] != -1) {
            return memo[mask][pos];
        }

        int ans = Integer.MAX_VALUE;
        for (int city = 0; city < N; city++) {
            if ((mask & (1 << city)) == 0) {
                int newAns = dist[pos][city] + tspUtil(mask | (1 << city), city, memo, dist);
                ans = Math.min(ans, newAns);
            }
        }

        return memo[mask][pos] = ans;
    }

    public static void runBranchAndBoundTSP(int[][] dist) {
        System.out.println("Minimum cost: " + tsp(dist));
    }
}
