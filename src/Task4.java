public class Task4 {
    public static double SumOfPowers(int b, int n){
        if(n==0) return 1;
        else{
            return SumOfPowers(b, n-1) + Math.pow(b, n);
        }
    }
}
