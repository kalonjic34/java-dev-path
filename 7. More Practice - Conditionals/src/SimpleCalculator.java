import java.util.Scanner;

public class SimpleCalculator {
    // Exercise 3: Calculator with Switch
    // Write a program that acts as a simple calculator. It takes two numbers and a mathematical operator (+, -, *, /) and performs the operation.

    // Requirements:

    // Use a switch statement to handle the operations.
    // Handle invalid operators with the default case.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a first number: ");
        int firstNumber = scan.nextInt();

        System.out.print("Enter a second number: ");
        int secondNumber = scan.nextInt();
        scan.nextLine();

        System.out.print("Enter operator (+, -, /, *): ");
        String operator = scan.nextLine();

        switch (operator) {
            case "+":
                System.out.print("Results: ");
                System.out.print(firstNumber + secondNumber);
                break;
            case "-":
                System.out.print("Results: ");
                System.out.print(firstNumber - secondNumber);
                break;
            case "/":
                System.out.println("Results: "+firstNumber / secondNumber);
                break;
            case "*":
                System.out.println("Results: "+firstNumber * secondNumber);
                break;
            default:
                System.out.println("Wrong operator!");
                break;
        }
        scan.close();
    }
}