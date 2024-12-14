import java.util.Arrays;
import java.util.Scanner;

public class FillArrayDemo {
    public static void main(String[] args) {
        
        // prompt the user for size of the array
        Scanner scan = new Scanner(System.in);
        System.out.print("What size aray do you want? ");
        int size = scan.nextInt();
        
        System.out.print("What number do you want to fill the array with? ");
        int theNum = scan.nextInt();

        // initialize the array
        int[] myDataArray = new int[size];


        // fill the array
        Arrays.fill(myDataArray, theNum);

        System.out.println();

        // disply the contents of the array
        for (int temp : myDataArray) {
            System.out.println(temp);
        }

        scan.close();

    }
}