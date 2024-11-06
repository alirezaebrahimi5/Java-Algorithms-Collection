package Matching;

import java.util.Arrays;

public class SuffixArray {
    public static int[] buildSuffixArray(String text) {
        int n = text.length();
        Suffix[] suffixes = new Suffix[n];

        for (int i = 0; i < n; i++) {
            suffixes[i] = new Suffix(i, text.substring(i));
        }

        Arrays.sort(suffixes, (s1, s2) -> s1.suffix.compareTo(s2.suffix));

        int[] suffixArr = new int[n];
        for (int i = 0; i < n; i++) {
            suffixArr[i] = suffixes[i].index;
        }
        return suffixArr;
    }

    static class Suffix {
        int index;
        String suffix;

        Suffix(int index, String suffix) {
            this.index = index;
            this.suffix = suffix;
        }
    }

    public static void runSuffixArray(String text) {
        int[] suffixArr = buildSuffixArray(text);

        System.out.println("Suffix Array:");
        for (int index : suffixArr) {
            System.out.println(index + ": " + text.substring(index));
        }
    }
}
