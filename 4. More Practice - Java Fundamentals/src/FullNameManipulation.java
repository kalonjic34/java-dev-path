import java.util.Scanner;

public class FullNameManipulation {
    /*
    Exercise 1: String Manipulation
    Description: Write a Java program that takes a user's first and last name as input, then performs the following operations:
    Concatenate the first and last names to create a full name.
    Convert the full name to uppercase.
    Print the length of the full name.
    Print the first and last character of the full name.
    Instructions:
    Create a new Java class named FullNameManipulation.
    Use the Scanner class to read input from the user.
    Perform the required string operations and display the results.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = scan.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scan.nextLine();

        String fullName = firstName+" "+lastName;
        System.out.println("Full name: "+fullName);

        System.out.println("Uppercase full name: "+fullName.toUpperCase());


        System.out.println("Length of full name: "+fullName.length());
        System.out.println("First character: "+firstName.charAt(0));
        System.out.println("Last character: "+lastName.charAt(6));
        scan.close();
    }
}