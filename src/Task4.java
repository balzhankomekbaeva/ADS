public class Task4 {
    public static int sumOfPowers(int base, int n, int exponent) {
        if (n == 0) {
            return 0;
        } else {
            return (int) Math.pow(base, exponent) + sumOfPowers(base, n - 1, exponent + 1);
        }
    }
}
