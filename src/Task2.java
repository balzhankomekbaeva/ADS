public class Task2 {
    public static int sumOfElements(int[] arr, int n, int index) {
        if (n == 0) {
            return 0;
        } else {
            return arr[index] + sumOfElements(arr, n - 1, index + 1);
        }
    }
}
