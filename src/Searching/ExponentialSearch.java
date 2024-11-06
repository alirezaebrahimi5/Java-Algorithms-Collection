package Searching;

public class ExponentialSearch {
    public static int exponentialSearch(int[] arr, int x) {
        int n = arr.length;
        if (arr[0] == x) return 0;

        int i = 1;
        while (i < n && arr[i] <= x) {
            i *= 2;
        }
        return binarySearch(arr, i / 2, Math.min(i, n - 1), x);
    }

    private static int binarySearch(int[] arr, int low, int high, int x) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) return mid;
            if (arr[mid] < x) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static void runExponentialSearch(int[] arr, int x) {

        int result = exponentialSearch(arr, x);
        System.out.println(result != -1 ? "Found at index " + result : "Not Found");
    }
}
