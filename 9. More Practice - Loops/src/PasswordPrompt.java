import java.util.Scanner;

public class PasswordPrompt {
    // Coding Exercise 4: Do-While Loop - Password Prompt
    // Write a program that prompts the user for a password using a do-while loop. Keep asking until the user enters the correct password ("password123").

    // Requirements:

    // Use a do-while loop.
    // Print a success message when the password is correct.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userPassword = "p@ss123";
        
            do {
            System.out.print("Enter the password: ");
            String inputPassword = scan.nextLine();

            if (inputPassword.equals(userPassword)) {
                System.out.println("Access granted.");
                break;
            }
            System.out.println("Incorrect password. Try again");
        }   while (true);
        scan.close();
    }
    
}