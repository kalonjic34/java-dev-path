import java.util.Scanner;
public class CaloriesCounterPro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String food1, food2, food3;
        int calories1, calories2, calories3;
        int totalCalories;

        System.out.println("Welcome to the Calories Counter Pro");

        System.out.print("Enter the name of food 1: ");
        food1 = scan.nextLine();
        System.out.print("Enter the calories for "+food1+" ");
        calories1 = scan.nextInt();
        scan.nextLine();

        System.out.print("Enter the name of food 2: ");
        food2 = scan.nextLine();
        System.out.print("Enter the calories for "+food2+" ");
        calories2 = scan.nextInt();
        scan.nextLine();

        System.out.print("Enter the name of food 3: ");
        food3 = scan.nextLine();
        System.out.print("Enter the calories for "+food3+" ");
        calories3 = scan.nextInt();
        scan.nextLine();

        totalCalories = calories1 + calories2 + calories3;

        System.out.println("\nYour calories Intake: ");
        System.out.println("1. "+food1+" - "+ calories1+" calories");
        System.out.println("2. "+food2+" - "+ calories2+" calories");
        System.out.println("3. "+food3+" - "+ calories3+" calories");
        System.out.println("\nYour calories Intake total was :"+totalCalories);

        System.out.println("Thank for using Calories Counter Pro");
        scan.close();
    }
}