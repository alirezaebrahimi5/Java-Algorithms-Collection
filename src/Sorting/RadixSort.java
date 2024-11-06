package Sorting;

import java.util.Arrays;

public class RadixSort {
    public static void radixSort(int[] arr) {
        int max = Arrays.stream(arr).max().orElse(0);
        for (int exp = 1; max / exp > 0; exp *= 10)
            countingSort(arr, exp);
    }

    private static void countingSort(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];

        for (int num : arr) count[(num / exp) % 10]++;

        for (int i = 1; i < 10; i++) count[i] += count[i - 1];

        for (int i = n - 1; i >= 0; i--) {
            int num = arr[i];
            output[count[(num / exp) % 10] - 1] = num;
            count[(num / exp) % 10]--;
        }

        System.arraycopy(output, 0, arr, 0, n);
    }

    public static void runRadixSort(int[] arr) {
        radixSort(arr);
        System.out.println(Arrays.toString(arr));  // Output: sorted array
    }
}
