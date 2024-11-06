package DynamicProgramming;

import java.util.Arrays;

public class LIS {
    public static int lis(int[] arr) {
        int n = arr.length;
        int[] lis = new int[n];
        Arrays.fill(lis, 1);

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && lis[i] < lis[j] + 1) {
                    lis[i] = lis[j] + 1;
                }
            }
        }

        return Arrays.stream(lis).max().orElse(1);
    }

    public static void runLIS(int[] arr) {
        System.out.println("Length of LIS: " + lis(arr)); // Output: 5
    }
}