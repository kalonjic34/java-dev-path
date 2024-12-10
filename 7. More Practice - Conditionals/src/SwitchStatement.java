import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter computer type: ");
        String computerType = scan.nextLine();

        // convert the input to lower case
        computerType = computerType.toLowerCase();
        switch (computerType) {
            case "smartphone":
                System.out.println("Smartphones offer computing power in your hand.");
                break;
            case "tablet":
                System.out.println("Tablets are lightweight for browsing and light tasks.");
                break;
            case "laptop":
                System.out.println("Laptops are portable for work on the go.");
                break;
            case "desktop":
                System.out.println("Desktop excel in gaming and work related tasks.");
                break;
            default:
                System.out.println("Unknown computer type.");
                break;
        }
        scan.close();
    }
}