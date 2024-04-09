public class Task3 {
    public static int SumOfIntegers(int n){
        if(n<=1) return 1;
        else{
            return SumOfIntegers(n-1)+n;
        }
    }
}
