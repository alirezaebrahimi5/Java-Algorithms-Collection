package ML;

import java.util.*;

public class KMeans {
    static class Cluster {
        List<double[]> points = new ArrayList<>();
        double[] centroid;
    }

    public static List<Cluster> kMeans(double[][] data, int k) {
        int n = data.length;
        int m = data[0].length;

        // Randomly initialize centroids
        Random rand = new Random();
        List<double[]> centroids = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            centroids.add(data[rand.nextInt(n)]);
        }

        List<Cluster> clusters = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            clusters.add(new Cluster());
        }

        boolean changed = true;
        while (changed) {
            changed = false;
            for (Cluster cluster : clusters) {
                cluster.points.clear();
            }

            // Assign points to closest centroid
            for (double[] point : data) {
                int nearestCentroid = -1;
                double minDistance = Double.MAX_VALUE;
                for (int i = 0; i < k; i++) {
                    double distance = euclideanDistance(point, centroids.get(i));
                    if (distance < minDistance) {
                        minDistance = distance;
                        nearestCentroid = i;
                    }
                }
                clusters.get(nearestCentroid).points.add(point);
            }

            // Update centroids
            for (int i = 0; i < k; i++) {
                double[] newCentroid = new double[m];
                for (double[] point : clusters.get(i).points) {
                    for (int j = 0; j < m; j++) {
                        newCentroid[j] += point[j];
                    }
                }
                for (int j = 0; j < m; j++) {
                    newCentroid[j] /= clusters.get(i).points.size();
                }

                if (!Arrays.equals(newCentroid, centroids.get(i))) {
                    centroids.set(i, newCentroid);
                    changed = true;
                }
            }
        }

        return clusters;
    }

    private static double euclideanDistance(double[] a, double[] b) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += Math.pow(a[i] - b[i], 2);
        }
        return Math.sqrt(sum);
    }

    public static void runKMeans(double[][] data, int k) {

        List<Cluster> clusters = kMeans(data, k);

        for (int i = 0; i < k; i++) {
            System.out.println("Cluster " + i + ":");
            for (double[] point : clusters.get(i).points) {
                System.out.println(Arrays.toString(point));
            }
        }
    }
}
