import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        // Check for voting age
        
        Scanner scan = new Scanner(System.in);

        int minVotingAge = 18;

        System.out.print("Enter your age: ");
        int age = scan.nextInt();

        System.out.println("Minimum voting age: "+minVotingAge);

        boolean eligible = age >= minVotingAge;
        System.out.println("\nEligible: "+eligible);
        if (eligible) {
            // Executes if boolean condition is true
            System.out.println("You are eligible to vote.");
        }else{
            // Executes if boolean condition is false
            System.out.println("You are NOT eligible to vote.");
        }
        scan.close();
    }
}