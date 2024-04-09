import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("\n \n*********************\n" +
                    "Choose number of task\n" +
                    "1)sum of the squares\n" +
                    "2)sum of the first n elements of an array\n" +
                    "3)sum of the first n positive integers\n" +
                    "4)sum of the first n powers\n" +
                    "5)sequence of elements in reverse order\n" +
                    "6)sequence of strings in reverse order\n" +
                    "7)print NxN square in spiral mode\n" +
                    "8)output all sequences xi such that 1<=xi<=k\n" +
                    "9)print all permutations of a string\n" +
                    "10)check if an integer is a power of two\n");
            String choice = scanner.next();

            if (choice.equals("1")) {
                System.out.print("Enter a number for first n elements of the squares: ");
                int n = scanner.nextInt();
                int result = Task1.SumOfSquares(n);
                System.out.println("Output");
                System.out.println(result);
            }

            else if (choice.equals("2")) {
                System.out.print("Enter a number for first n elements of an array: ");
                int n = scanner.nextInt();

                System.out.print("Enter the numbers of elements for an array: ");
                int numElements = scanner.nextInt();
                int[] numbers = new int[numElements];

                System.out.print("Enter the elements for an array: ");
                for (int i = 0; i < numElements; i++) {
                    numbers[i] = scanner.nextInt();
                }

                int result = Task2.sumOfElements(numbers, n, 0);
                System.out.println("Output");
                System.out.println(result);
            }

            else if (choice.equals("3")) {
                System.out.print("Enter a number for first n elements of the sum: ");
                int n = scanner.nextInt();
                int result = Task3.sumOfPositiveIntegers(n);
                System.out.println("Output");
                System.out.println(result);
            }

            else if (choice.equals("4")) {
                System.out.print("Enter a number for first n powers: ");
                int n = scanner.nextInt();
                System.out.print("Enter a value for base: ");
                int base = scanner.nextInt();
                double result = Task4.sumOfPowers(base, n, 0);
                System.out.println("Output");
                System.out.println(result);
            }

            else if (choice.equals("5")) {
                System.out.print("Enter the numbers of elements for an array: ");
                int n = scanner.nextInt();
                System.out.print("Enter the elements: ");

                Task5.reverse(n, scanner);
            }

            else if (choice.equals("6")) {
                System.out.print("Enter the number of strings in the sequence: ");
                int numStrings = scanner.nextInt();
                System.out.println("Enter the strings:");
                Task6.displayStringsInReverse(numStrings, scanner);
            }

            else if (choice.equals("7")){
                System.out.print("Enter the size of the square: ");
                int size = scanner.nextInt();
                Task7.printSpiralSquare(size, 1, 0, 0, size, new int[size][size]);
            }

            else if (choice.equals("8")){
                System.out.print("Enter the integers n and k (separated by space): ");
                int n = scanner.nextInt();
                int k = scanner.nextInt();
                Task8.outputSequences(n, 1, k, "");
            }

            else if (choice.equals("9")){
                System.out.print("Enter the string: ");
                String input = scanner.next();
                Task9.generatePermutations("",input);
            }

            else if (choice.equals("10")){
                System.out.print("Enter an integer to check if it's a power of two: ");
                int num = scanner.nextInt();
                boolean isPowerOfTwo = Task10.checkPowerOfTwo(num);
                System.out.println(num + " is " + (isPowerOfTwo ? "a power of two" : "not a power of two"));
            }
            else {
                System.out.println("Invalid choice. Please choose number of a task.");
            }
        }
    }
}