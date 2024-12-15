public class GreetPerson {
    // Coding Exercise 1: Greet Multiple People
    // Write a method named greetPerson that takes a person's name as a parameter and prints a personalized greeting.

    // Steps:

    // Define a method greetPerson(String name) that prints Hello, [name]!.
    // Call this method multiple times in main with different names.

    public static void main(String[] args) {
        greetPerson("Alice");
        greetPerson("Sam");
        greetPerson("Liam");
    }

    static void greetPerson(String name){
        System.out.println("Hello, "+name+"!");
    }
}