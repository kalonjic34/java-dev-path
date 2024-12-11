public class SumOfNumbers {
    // Coding Exercise 2: Sum of Numbers
    // Write a program that calculates the sum of all numbers from 1 to 100 using a for loop.

    // Requirements:

    // Use a for loop to add numbers from 1 to 100.
    // Print the result.
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <=100; i++) {
            sum +=i;
        }
        System.out.println("The sum of numbers from 1 to 100: "+sum);
    }
}