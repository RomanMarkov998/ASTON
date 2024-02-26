import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number a: ");
        int a = scanner.nextInt();

        System.out.print("Enter the number b: ");
        int b = scanner.nextInt();

        
        compareNumbers(a, b);

        
        performArithmeticOperations(a, b);
    }

    private static void compareNumbers(int a, int b) {
       
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }
    }

    private static void performArithmeticOperations(int a, int b) {
        System.out.println("Addition (a + b): " + (a + b));
        System.out.println("Subtraction (a - b): " + (a - b));

        if (b != 0) {
            System.out.println("Division(a / b): " + ((double) a / b));
        } else {
            System.out.println("Division by zero is impossible");
        }

        System.out.println("Multiplication (a * b): " + (a * b));
    }
}
