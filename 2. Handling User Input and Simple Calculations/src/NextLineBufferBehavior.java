import java.util.Scanner;

public class NextLineBufferBehavior {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scan.nextInt();
        scan.nextLine(); // to consume the next line (Enter key)

        System.out.print("Enter your name: ");
        String name = scan.nextLine();

        System.out.println("Welcome to the Java Club "+ name);
        scan.close();
    }
}
