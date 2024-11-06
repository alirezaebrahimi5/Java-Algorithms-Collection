package Matching;

public class RabinKarp {

    public static void rabinKarp(String txt, String pat, int d, int q) {
        int m = pat.length();
        int n = txt.length();
        int p = 0;
        int t = 0;
        int h = 1;

        for (int i = 0; i < m - 1; i++)
            h = (h * d) % q;

        for (int i = 0; i < m; i++) {
            p = (d * p + pat.charAt(i)) % q;
            t = (d * t + txt.charAt(i)) % q;
        }

        for (int i = 0; i <= n - m; i++) {
            if (p == t) {
                int j;
                for (j = 0; j < m; j++)
                    if (txt.charAt(i + j) != pat.charAt(j))
                        break;

                if (j == m) System.out.println("Pattern found at index " + i);
            }

            if (i < n - m) {
                t = (d * (t - txt.charAt(i) * h) + txt.charAt(i + m)) % q;
                if (t < 0) t = t + q;
            }
        }
    }

    public static void runrabinKarp(String txt, String pat, int d, int q) {
        rabinKarp(txt, pat, d , q);
    }
}
