package Mathematics;

public class EuclideanGCD {

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void runGCD(int a, int b) {
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd(a, b));
    }
}
