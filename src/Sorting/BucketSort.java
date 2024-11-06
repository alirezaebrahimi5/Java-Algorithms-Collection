package Sorting;

import java.util.*;

public class BucketSort {
    public static void bucketSort(float[] arr) {
        int n = arr.length;
        if (n <= 0) return;

        // Create n empty buckets
        @SuppressWarnings("unchecked")
        List<Float>[] buckets = new List[n];
        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<>();
        }

        // Put array elements in buckets
        for (int i = 0; i < n; i++) {
            int bucketIndex = (int) (arr[i] * n);
            buckets[bucketIndex].add(arr[i]);
        }

        // Sort individual buckets
        for (int i = 0; i < n; i++) {
            Collections.sort(buckets[i]);
        }

        // Concatenate all buckets into arr[]
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (float num : buckets[i]) {
                arr[index++] = num;
            }
        }
    }

    public static void printArray(float[] arr) {
        for (float num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void runBucketSort(float[] arr) {
        bucketSort(arr);
        printArray(arr);
    }
}
