import java.util.Scanner;

public class SumOfNumbers {
    // Exercise 3: Sum of Numbers Using a Method
    // Write a method named findSum that takes two integers as parameters and returns their sum.

    // Steps:

    // Define a method findSum(int num1, int num2) that computes the sum of the two numbers.
    // Call this method from main and display the result.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter number: ");
        int num2 = scan.nextInt();
        int output = findSum(num1, num2);
        System.out.println("The sum of "+num1+" and "+num2+": "+output);
        scan.close();
    }

    static int findSum(int num1, int num2){
        int result = num1 + num2;
        return result;
    }
}