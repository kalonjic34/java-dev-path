import java.util.Scanner;

public class StringInput {
    public static void main(String[] args) {
        // a scanner for reading input from the user
        Scanner scan = new Scanner(System.in);

        // prompt the user
        System.out.print("What is your favorite color? ");
        
        // read the input from the user
        String theColor = scan.nextLine();

        // prompt the user
        System.out.print("What is your favorite hobby? ");
        
        // read the input from the user
        String theHobby = scan.nextLine();

        System.out.println("\nYour favorite color is "+theColor);
        System.out.println("your hobby is "+theHobby);

        // close to release resources and prevent resourse/memory leaks
        scan.close();
    }
}