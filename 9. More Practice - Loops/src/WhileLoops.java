import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean done = false;

        while (!done) {
            System.out.println("Hello World");
            System.out.print("Are we done? Y/N: ");
            String userInput = scan.nextLine();

            if (userInput.equalsIgnoreCase("Y")) {
                done = true;
            }
            System.out.println();
        }


        // do while

        do {
            System.out.println("Hello World");
            System.out.print("Are we done? Y/N: ");
            String userInput = scan.nextLine();

            if (userInput.equalsIgnoreCase("Y")) {
                done = true;
            }
            System.out.println();
        }while (!done);

        scan.close();
    }
}