package Searching;

public class TernarySearch {
    public static int ternarySearch(int[] arr, int left, int right, int x) {
        if (right >= left) {
            int mid1 = left + (right - left) / 3;
            int mid2 = right - (right - left) / 3;

            if (arr[mid1] == x) return mid1;
            if (arr[mid2] == x) return mid2;

            if (x < arr[mid1]) return ternarySearch(arr, left, mid1 - 1, x);
            else if (x > arr[mid2]) return ternarySearch(arr, mid2 + 1, right, x);
            else return ternarySearch(arr, mid1 + 1, mid2 - 1, x);
        }
        return -1;
    }

    public static void runTernarySearch(int[] arr, int x) {
        int result = ternarySearch(arr, 0, arr.length - 1, x);
        System.out.println(result != -1 ? "Found at index " + result : "Not Found");
    }
}
