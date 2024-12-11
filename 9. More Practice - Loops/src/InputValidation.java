import java.util.Scanner;

public class InputValidation {
    // Coding Exercise 3: While Loop - Input Validation
    // Write a program that keeps asking the user to enter a number greater than 10. If the number is less than or equal to 10, ask again. Use a while loop.

    // Requirements:

    // Use a while loop to validate user input.
    // Print a success message when the input is valid.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userInput;

        while (true) {
            System.out.print("Enter a number greater than 10: ");
            userInput = scan.nextInt();

            if (userInput >= 10) {
                System.out.println("Thank you. You entered "+userInput+".");
                break;
            }
            System.out.println("Invalid input. Try again");
        }
        scan.close();
    }
}