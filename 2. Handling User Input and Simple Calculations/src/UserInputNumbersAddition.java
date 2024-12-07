import java.util.Scanner;
public class UserInputNumbersAddition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // System.out.print("Enter your name: ");
        // String name = scan.nextLine();

        // Created a simple calculator which is an adder

        System.out.print("Enter number a: ");
        int a = scan.nextInt();
        System.out.print("Enter number b: ");
        int b = scan.nextInt();
        int sum = a + b;
        System.out.println("The sum of a & b is: "+sum);

        // Asking user their age

        System.out.print("Enter your age: ");
        int age = scan.nextInt();
        System.out.print("So your age is: "+age);

        // System.out.println("Welcome to the Java Club "+name);
        scan.close();
    }
}