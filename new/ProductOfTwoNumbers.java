import java.util.Scanner;

public class ProductOfTwoNumbers {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Calculate the product of the two numbers
        double product = num1 * num2;

        // Display the result
        System.out.println("The product of " + num1 + " and " + num2 + " is: " + product);

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
