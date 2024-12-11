public class MultiplicationTable {
    // Coding Exercise 4: Nested Loop - Multiplication Table
    // Write a program that generates a 10x10 multiplication table using nested for loops.

    // Requirements:

    // Use nested for loops.
    // Print the table in a grid format.
    public static void main(String[] args) {
        for (int row = 1; row <= 10; row++) {
            for (int col = 1; col <= 10; col++) {
                int value = row * col;
                System.out.print(value +"\t");
            }
            System.out.println();
        }
    }
}