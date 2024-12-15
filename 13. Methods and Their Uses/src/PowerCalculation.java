import java.util.Scanner;

public class PowerCalculation {
    // Coding Exercise 4: Calculate n-th Power
    // Write a method named power that takes two integers, base and exponent, and calculates base^exponent using recursion.

    // Steps:

    // Define a recursive method power(int base, int exponent):
    // If exponent == 0, return 1 (base case).
    // Otherwise, return base * power(base, exponent - 1).
    // Call this method from main and display the result.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter base: ");
        int base = scan.nextInt();
        System.out.print("Enter exponent: ");
        int exponent = scan.nextInt();
        System.out.println("Result: "+power(base, exponent));
        scan.close();

    }
    static int power(int base, int exponent){
        if (exponent == 0) {
            return 1;
        }else{
            return base * power(base, exponent -1);
        }
    }
}