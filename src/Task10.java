public class Task10 {
    public static boolean checkPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        } else if (n == 1) {
            return true;
        } else {
            return n % 2 == 0 && checkPowerOfTwo(n / 2);
        }
    }
}
