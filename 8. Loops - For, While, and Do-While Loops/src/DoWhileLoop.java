import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input;
        do {
            System.out.println("Please enter a number. 0 to exit!");
            input = scan.nextInt();
            System.out.println("Thanks for entering "+input);
        } while (input != 0);
        scan.close();
    }
}