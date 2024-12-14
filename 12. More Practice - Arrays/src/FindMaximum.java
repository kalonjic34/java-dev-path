import java.util.Scanner;

public class FindMaximum {
    // Coding Exercise 3: Find Maximum
    // Write a program to find the largest number in an array.

    // Steps:

    // Prompt the user for the size of the array.
    // Allow the user to fill the array with numbers.
    // Iterate through the array to find the largest number.
    // Print the largest number.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What size array do you want? ");
        int numSizeArray = scan.nextInt();

        System.out.println();

        int[] dataArray = new int[numSizeArray];

        for (int i = 0; i < dataArray.length; i++) {
            System.out.println("Enter number "+(i+1)+": ");
            dataArray[i] = scan.nextInt();
        }

        int maxNumber = findMaxNumber(dataArray);
        System.out.print("The max number is: "+maxNumber);

        scan.close();
    }

    private static int findMaxNumber(int[] dataArray) {
        int max = dataArray[0];

        for (int temp : dataArray) {
            if (temp > max) {
                max = temp;
            }
        }
        return max;
        
    }
}