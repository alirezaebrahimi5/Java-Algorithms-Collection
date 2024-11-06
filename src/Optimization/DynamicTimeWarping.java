package Optimization;

public class DynamicTimeWarping {
    public static double computeDTW(double[] series1, double[] series2) {
        int len1 = series1.length;
        int len2 = series2.length;

        double[][] dtw = new double[len1 + 1][len2 + 1];

        for (int i = 0; i <= len1; i++) {
            for (int j = 0; j <= len2; j++) {
                dtw[i][j] = Double.MAX_VALUE;
            }
        }
        dtw[0][0] = 0;

        for (int i = 1; i <= len1; i++) {
            for (int j = 1; j <= len2; j++) {
                double cost = Math.abs(series1[i - 1] - series2[j - 1]);
                dtw[i][j] = cost + Math.min(Math.min(dtw[i - 1][j], dtw[i][j - 1]), dtw[i - 1][j - 1]);
            }
        }

        return dtw[len1][len2];
    }

    public static void runDynamicTimeWarping(double[] series1, double[] series2) {


        System.out.println("DTW distance: " + computeDTW(series1, series2));
    }
}
