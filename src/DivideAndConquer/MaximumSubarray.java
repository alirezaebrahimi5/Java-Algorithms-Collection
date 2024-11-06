package DivideAndConquer;

public class MaximumSubarray {

    public static int maxCrossingSum(int arr[], int left, int mid, int right) {
        int sum = 0;
        int leftSum = Integer.MIN_VALUE;
        for (int i = mid; i >= left; i--) {
            sum += arr[i];
            if (sum > leftSum) {
                leftSum = sum;
            }
        }

        sum = 0;
        int rightSum = Integer.MIN_VALUE;
        for (int i = mid + 1; i <= right; i++) {
            sum += arr[i];
            if (sum > rightSum) {
                rightSum = sum;
            }
        }

        return leftSum + rightSum;
    }

    public static int maxSubArraySum(int arr[], int left, int right) {
        if (left == right) {
            return arr[left];
        }

        int mid = (left + right) / 2;

        int leftSum = maxSubArraySum(arr, left, mid);
        int rightSum = maxSubArraySum(arr, mid + 1, right);
        int crossingSum = maxCrossingSum(arr, left, mid, right);

        return Math.max(Math.max(leftSum, rightSum), crossingSum);
    }

    public static void runMaximumSubarray(int[] array) {
        int n = array.length;
        int maxSum = maxSubArraySum(array, 0, n - 1);
        System.out.println("Maximum subarray sum is " + maxSum);
    }
}
