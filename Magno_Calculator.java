import java.util.Scanner;

public class Magno_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        double number1 = input.nextDouble(); // Use double for arithmetic calculations

        System.out.print("Enter Second Number: ");
        double number2 = input.nextDouble(); // Use double for arithmetic calculations

        // Perform arithmetic operations and display results
        System.out.println("Sum: " + (number1 + number2));
        System.out.println("Difference: " + (number1 - number2));
        System.out.println("Product: " + (number1 * number2));
        System.out.println("Division: " + (number1 / number2));
        
    }
}