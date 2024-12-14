import java.util.Scanner;

public class MultiplicationTableDemo {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("How many rows: ");
        int numRows = scan.nextInt();

        System.out.print("How many rows: ");
        int numCols = scan.nextInt();

        scan.close();

        // initialize the array based on the rows and columns
        int[][] table = new int[numRows][numCols];

        // compute multiplication table values

        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                table[row][row] = (row+1) * (col+1);
            }
        }

        System.out.println();
        //print out the results

        for (int rows = 0; rows < numRows; rows++) {
            for (int col = 0; col < numCols; col++) {
                System.out.println(table[rows][col]+ "\t");
            }
            System.out.println();
        }
    }
}