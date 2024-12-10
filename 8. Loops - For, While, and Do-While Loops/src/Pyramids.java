import java.util.Scanner;

public class Pyramids {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number of levels: ");
        int levels = scan.nextInt();

        for (int i = 1; i <= levels; i++) {
            for (int j = 0; j < levels - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scan.close();
    }
}