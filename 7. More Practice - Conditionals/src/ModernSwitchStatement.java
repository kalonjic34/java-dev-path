import java.util.Scanner;

public class ModernSwitchStatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your computer type: ");
        String computerType = scan.nextLine();

        computerType = computerType.toLowerCase();
        
        // Version 1
        
        switch (computerType) {
            case "smartphone" -> System.out.println("Smart phones offer computing power in your hand.");
            case "tablet" -> System.out.println("Tablet are lightweight fror browsing and light tasks.");
            case "laptop" -> System.out.println("Laptops are portable for work on the go.");
            case "desktop" -> System.out.println("Desktops excels in gaming and work related tasks.");
            default -> System.out.println("Unknown computer type.");
        }
        

        // Version 2
        String description = switch (computerType) {
            case "smartphone" -> "Smart phones offer computing power in your hand.";
            case "tablet" -> "Tablet are lightweight fror browsing and light tasks.";
            case "laptop" -> "Laptops are portable for work on the go.";
            case "desktop" -> "Desktops excels in gaming and work related tasks.";
            default -> "Unknown computer type.";
        };
        System.out.println(description);

        scan.close();
    }
}