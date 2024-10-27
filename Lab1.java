import java.util.Scanner;

public class SumAndMultiply {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Read two numbers from the user
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Calculation: Sum and product
        double sum = num1 + num2;
        double product = num1 * num2;

        // Output: Display the results
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);

        // Close the scanner
        scanner.close();
    }
}

