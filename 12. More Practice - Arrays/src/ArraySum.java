import java.util.Scanner;

public class ArraySum {
    // Coding Exercise 1: Array Sum
    // Write a program that does the following:

    // Ask the user to specify the size of an array.
    // Allow the user to input values into the array.
    // Calculate and print the sum of all elements in the array.
    // Requirements:

    // Use a for loop to iterate through the array and calculate the sum.
    // Print the result.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What size array do you want? ");
        int sizeArray = scan.nextInt();

        System.out.println();

        int[] dataArray = new int[sizeArray];

        for (int i = 0; i < dataArray.length; i++) {
            System.out.print("Enter number "+(i+1)+": ");
            dataArray[i] = scan.nextInt();
        }

        int sumElements = calculateSumElements(dataArray);
        System.out.println("The sum of all elements: "+sumElements);
        
        scan.close();     
}
        
    private static int calculateSumElements(int[] dataArray) {
        int sum = 0;
        for (int temp : dataArray) {
            sum += temp;
        }
        return sum;
        }
    
}