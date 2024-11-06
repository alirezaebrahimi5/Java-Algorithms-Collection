package Searching;

public class FibonacciSearch {

    public static int fibonacciSearch(int[] arr, int x) {
        int n = arr.length;
        int fibMMinus2 = 0;  // (m-2)'th Fibonacci No.
        int fibMMinus1 = 1;  // (m-1)'th Fibonacci No.
        int fibM = fibMMinus2 + fibMMinus1;  // m'th Fibonacci

        // Find the smallest Fibonacci number greater than or equal to n
        while (fibM < n) {
            fibMMinus2 = fibMMinus1;
            fibMMinus1 = fibM;
            fibM = fibMMinus2 + fibMMinus1;
        }

        int offset = -1;

        // Start comparing from the index `fibMMinus2` of the array
        while (fibM > 1) {
            int i = Math.min(offset + fibMMinus2, n - 1);

            // If x is greater than the value at index `i`, cut the subarray from `i+1` to the end
            if (arr[i] < x) {
                fibM = fibMMinus1;
                fibMMinus1 = fibMMinus2;
                fibMMinus2 = fibM - fibMMinus1;
                offset = i;
            }
            // If x is less than the value at index `i`, cut the subarray from the start to `i`
            else if (arr[i] > x) {
                fibM = fibMMinus2;
                fibMMinus2 = fibMMinus1 - fibMMinus2;
                fibMMinus1 = fibMMinus1 - fibMMinus2;
            }
            // Element found
            else return i;
        }

        // The last comparison
        if (fibMMinus1 == 1 && arr[offset + 1] == x) {
            return offset + 1;
        }

        return -1;  // Element not found
    }

    public static void runFibonacciSearch(int[] arr, int x) {
        int index = fibonacciSearch(arr, x);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
