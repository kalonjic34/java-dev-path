import java.util.Scanner;

public class LibraryMembership {
    // Exercise 2: Library Membership

    // Write a program that checks if a person qualifies for a free library membership based on their age and number of books borrowed.

    // Requirements:

    // If the person is under 18 or has borrowed more than 10 books, they qualify for a free membership.
    // Otherwise, they do not qualify.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scan.nextInt();

        System.out.print("Enter number of books borrowed: ");
        int booksBorrowed = scan.nextInt();

        if (age < 18 && booksBorrowed > 10) {
            System.out.println("You qualify for a free membership.");
        } else{
            System.out.println("You don't qualify for a free membership.");
        }
        scan.close();
    }
}