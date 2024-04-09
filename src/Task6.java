import java.util.Scanner;

public class Task6 {
    public static void displayStringsInReverse(int n, Scanner scanner) {
        if (n == 0) {
            return;
        } else {
            String input = scanner.next();
            displayStringsInReverse(n - 1, scanner);
            System.out.println(input);
        }
    }
}