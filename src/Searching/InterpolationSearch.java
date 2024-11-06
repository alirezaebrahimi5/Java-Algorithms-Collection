package Searching;

public class InterpolationSearch {
    public static int interpolationSearch(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        while (low <= high && x >= arr[low] && x <= arr[high]) {
            if (low == high) {
                if (arr[low] == x) return low;
                return -1;
            }

            int pos = low + ((x - arr[low]) * (high - low)) / (arr[high] - arr[low]);

            if (arr[pos] == x) return pos;
            if (arr[pos] < x) low = pos + 1;
            else high = pos - 1;
        }
        return -1;
    }

    public static void runinterpolationSearch(int[] arr, int x) {
        int result = interpolationSearch(arr, x);
        System.out.println(result != -1 ? "Found at index " + result : "Not Found");
    }
}
