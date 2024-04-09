import java.util.Scanner;
public class Task5 {
    public static void reverse(int n, Scanner scan){
        if (n == 0)
            return;
        int seq = scan.nextInt();
        reverse(n-1, scan);
        System.out.print(seq + " ");
    }
}
