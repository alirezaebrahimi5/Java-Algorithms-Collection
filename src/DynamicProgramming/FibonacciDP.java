package DynamicProgramming;

public class FibonacciDP {

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public static void runFibonacciDP(int n) {
        System.out.println("Fibonacci of " + n + " is: " + fibonacci(n));
    }
}
