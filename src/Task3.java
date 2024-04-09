public class Task3 {
    public static int sumOfPositiveIntegers(int n){
        if(n<=1) return 1;
        else{
            return sumOfPositiveIntegers(n-1)+n;
        }
    }



}
