import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose number of task\n" + "1)sum of the squares\n"
                + "2)sum of the first n elements of an array\n"
                + "3)sum of the first n positive integers\n"
                + "4)sum of the first n powers\n"
                + "5)sequence of elements in reverse order\n"
                + "6)sequence of strings in reverse order" );
        String choice = scanner.next();

        if (choice.equals("1")) {
            System.out.print("Enter a number for first n elements of the squares: ");
            int n = scanner.nextInt();
            int result = Task1.SumOfSquares(n);
            System.out.println(result);
        }

        else if (choice.equals("2")) {
            System.out.print("Enter a number for first n elements of an array: ");
            int n = scanner.nextInt();

            System.out.print("Enter the numbers of elements for an array: ");
            int numElements = scanner.nextInt();
            int[] numbers=new int[numElements];

            System.out.print("Enter the elements for an array: ");
            for( int i=0; i<numElements;i++){
                numbers[i]=scanner.nextInt();
            }
            int result = Task2.SumOfElements(numbers, n);
            System.out.println(result);
        }

        else if(choice.equals("3")){
            System.out.print("Enter a number for first n elements of the sum: ");
            int n = scanner.nextInt();
            int result = Task3.SumOfIntegers(n);
            System.out.println(result);
        }

        else if (choice.equals("4")){
            System.out.print("Enter a number for first n powers: ");
            int n = scanner.nextInt();
            System.out.print("Enter a value for base: ");
            int base = scanner.nextInt();
            double result = Task4.SumOfPowers(base, n);
            System.out.println(result);
        }

        else if (choice.equals("5")){
            System.out.print("Enter the numbers of elements for an array: ");
            int numElements = scanner.nextInt();
            int[] numbers=new int[numElements];

            System.out.print("Enter the elements for an array: ");
            for( int i=0; i<numElements;i++){
                numbers[i]=scanner.nextInt();
            }
            System.out.println("Output");
            for (int i = 0; i<numElements;i++) {
                int[] result = Task5.ReverseSequence(numbers, numElements);
                System.out.print(result[i]);
            }
        }

        else {
            System.out.println("Invalid choice. Please choose number of a task.");
        }

        scanner.close();
    }
}