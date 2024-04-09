public class Task8 {
    public static void outputSequences(int n, int current, int k, String sequence) {
        if (n == 0) {
            System.out.println(sequence);
            return;
        }

        for (int i = 1; i <= k; i++) {
            outputSequences(n - 1, i, k, sequence + i + " ");
        }
    }
}
