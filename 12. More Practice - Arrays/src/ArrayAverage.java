import java.util.Scanner;

public class ArrayAverage {
    // Coding Exercise 2: Array Average
    // Write a program that calculates the average of all numbers in an array.

    // Steps:

    // Prompt the user for the size of the array.
    // Allow the user to enter numbers into the array.
    // Calculate the sum of the numbers and divide by the size of the array to get the average.
    // Print the result.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What size array do you want? ");
        int sizeArray = scan.nextInt();
        
        System.out.println();

        double[] dataArray = new double[sizeArray];

        for (int i = 0; i < dataArray.length; i++) {
            System.out.print("Enter number "+(i+1)+": ");
            dataArray[i] = scan.nextDouble();
        }

        double arrayAverage = calculateArrayAverage(dataArray);
        System.out.println("The average: "+arrayAverage);
        
        scan.close();
    }
        
        private static double calculateArrayAverage(double[] dataArray) {

        double sum = 0.0;
        for (double temp : dataArray) {
            sum += temp;
        }   

        double average = sum / dataArray.length;
        return average;
    }
}