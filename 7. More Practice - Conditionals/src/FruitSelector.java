import java.util.Scanner;

public class FruitSelector {

    // Exercise 4: Fruit Selector
    // Write a program that takes the name of a fruit and prints a description of it using a switch statement.

    // Requirements:

    // Use a switch statement to evaluate the fruit name.
    // Add cases for "apple", "banana", "orange", and "grape".
    // Include a default case for unknown fruits.
    // Descriptions:

    // "apple": "Apples are red or green and delicious."
    // "banana": "Bananas are yellow and great for energy."
    // "orange": "Oranges are a good source of Vitamin C."
    // "grape": "Grapes are small, round, and juicy."
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a fruit: ");

        String pickFruit = scan.nextLine();
        pickFruit = pickFruit.toLowerCase();

        switch (pickFruit) {
            case "apple" -> System.out.println("Apples are red or green and delicious.");
            case "banana" -> System.out.println("Bananas are yellow and great for energy.");
            case "orange" -> System.out.println("Oranges are a good source of Vitamin C.");
            case "grape" -> System.out.println("Grapes are small, round, and juicy.");
            default -> System.out.println("That's not a fruit");
        }
        scan.close();
    }
}