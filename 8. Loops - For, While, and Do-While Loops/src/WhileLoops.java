import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int userInput = -1;

        while (userInput != 0) {
            System.out.println("Please enter a number. 0 to stop running this program.");
            userInput = scan.nextInt();
            System.out.println("You entered: "+userInput);
        }
        scan.close();
    }
}