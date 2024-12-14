import java.util.Arrays;
import java.util.Scanner;

public class SortArrayDemo {
    public static void main(String[] args) {
        
        // prompt the user for size of the array
        Scanner scan = new Scanner(System.in);
        System.out.print("What size aray do you want? ");
        int size = scan.nextInt();
 

        // initialize the array
        int[] myDataArray = new int[size];

        // read each number and assign it to an array
        for (int i = 0; i < myDataArray.length; i++) {
            System.out.print("Enter number "+(1+i)+": ");
            myDataArray[i] = scan.nextInt();
        }

        System.out.println();

        // print out the array elements
        System.out.println("BEFORE sorting: ");
        displayData(myDataArray);

        System.out.println();

        Arrays.sort(myDataArray);

        System.out.println("AFTER sorting: ");
        displayData(myDataArray);
        
        scan.close();

    }

    private static void displayData(int[] myDataArray) {
        for (int temp : myDataArray) {
            System.out.println(temp);
        }
    }
}