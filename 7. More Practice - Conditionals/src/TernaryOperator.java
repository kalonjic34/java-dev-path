import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int minVotingAge = 18;

        System.out.print("Enter your age: ");
        int age = scan.nextInt();

        System.out.println("Minimum voting age: "+minVotingAge);

        /*
        boolean eligible = age >= minVotingAge;
        System.out.println("\nEligible: "+eligible);
        if (eligible) {
            System.out.println("You are eligible to vote.");
        }else{
            System.out.println("You are NOT eligible to vote.");
        }
        */

        // Reduces amount of code.. but can be difficult to read
        String message = (age >= minVotingAge) ? "Your are eligible to vote" : "You are not eligible to vote";
        System.out.println(message);
        scan.close();
    }
}