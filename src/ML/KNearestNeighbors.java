package ML;

import java.util.*;

public class KNearestNeighbors {
    public static int classify(double[][] data, int[] labels, double[] test, int k) {
        int n = data.length;
        double[] distances = new double[n];

        for (int i = 0; i < n; i++) {
            distances[i] = euclideanDistance(data[i], test);
        }

        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }

        Arrays.sort(indices, (i1, i2) -> Double.compare(distances[i1], distances[i2]));

        Map<Integer, Integer> frequency = new HashMap<>();
        for (int i = 0; i < k; i++) {
            frequency.put(labels[indices[i]], frequency.getOrDefault(labels[indices[i]], 0) + 1);
        }

        return frequency.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
    }

    private static double euclideanDistance(double[] a, double[] b) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += Math.pow(a[i] - b[i], 2);
        }
        return Math.sqrt(sum);
    }

    public static void runKNearestNeighbors(double[][] data, int[] labels, double[] test, int k) {

        System.out.println("Predicted class: " + classify(data, labels, test, k));
    }
}
