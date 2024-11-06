package Mathematics;

public class FastExponentiation {
    public static int power(int base, int exp, int mod) {
        int result = 1;
        base = base % mod;

        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * base) % mod;
            }
            exp >>= 1;
            base = (base * base) % mod;
        }
        return result;
    }

    public static void runFastExponentiation(int base, int exp, int mod) {

        System.out.println("Result: " + power(base, exp, mod));
    }
}
