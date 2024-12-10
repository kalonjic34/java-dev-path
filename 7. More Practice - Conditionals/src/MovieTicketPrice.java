import java.util.Scanner;

public class MovieTicketPrice {
    // Exercise 1: Movie Ticket Price
    // Write a program that calculates the price of a movie ticket based on the person's age.

    // If the person is below 13, the ticket costs $8.
    // If the person is between 13 and 59 (inclusive), the ticket costs $12.
    // If the person is 60 or older, the ticket costs $6.
    // Requirements:

    // Use if-else statements to determine the ticket price.
    // Print the final ticket price.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scan.nextInt();

        if (age < 13) {
            System.out.println("The tickets cost $8.");
        } else if(age >= 13 && age <= 59){
            System.out.println("The ticket costs $12.");
        }else if (age>=60){
            System.out.println("The ticket costs $6.");
        }
        scan.close();
    }
}