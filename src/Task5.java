public class Task5 {
    public static int[] ReverseSequence(int[] arr, int n){
        int[] array = new int[n];
        for (int i = n-1; i >= 0; i--){
            array[n - 1 - i] = arr[i];
        }
        return array;
    }
}
