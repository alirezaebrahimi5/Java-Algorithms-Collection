package DivideAndConquer;

import java.util.Arrays;

public class ClosestPairOfPoints {

    static class Point {
        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static double dist(Point p1, Point p2) {
        return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
    }

    public static double closestPair(Point[] points, int n) {
        Arrays.sort(points, (p1, p2) -> Integer.compare(p1.x, p2.x));
        return closestPairRec(points, 0, n - 1);
    }

    private static double closestPairRec(Point[] points, int left, int right) {
        if (right - left <= 3)
            return bruteForce(points, left, right);

        int mid = left + (right - left) / 2;
        Point midPoint = points[mid];

        double dl = closestPairRec(points, left, mid);
        double dr = closestPairRec(points, mid + 1, right);
        double d = Math.min(dl, dr);

        return d;
    }

    private static double bruteForce(Point[] points, int left, int right) {
        double min = Double.MAX_VALUE;
        for (int i = left; i <= right; ++i) {
            for (int j = i + 1; j <= right; ++j) {
                double dist = dist(points[i], points[j]);
                if (dist < min) {
                    min = dist;
                }
            }
        }
        return min;
    }

    public static void runClosestPairOfPoints(int[][] arr) {
        Point[] points = new Point[arr.length];
        for (int i = 0; i < arr.length; i++) {
            points[i] = new Point(arr[i][0], arr[i][1]);
        }
        System.out.println("Closest Pair Distance: " + closestPair(points, points.length));
    }
}
