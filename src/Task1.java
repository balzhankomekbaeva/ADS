public class Task1 {
    public static int SumOfSquares(int num) {
        if (num == 1) {
            return 1;
        } else {
            return SumOfSquares(num - 1) + num * num;
        }
    }
}
