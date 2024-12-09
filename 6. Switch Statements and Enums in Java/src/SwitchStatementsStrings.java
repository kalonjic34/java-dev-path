import java.util.Scanner;

public class SwitchStatementsStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What season is it ");
        String season = scan.nextLine();
        scan.close();
        switch (season) {
            case "Spring":
                System.out.println("The flowers are blooming, how nice!");
                break;
            case "Summer":
                System.out.println("Its sunny and hot, time for the beach!");
                break;
            case "Autumn":
                System.out.println("The leaves are falling and its windy!");
                break;
            case "Winter":
                System.out.println("Cold and snowy, lets build a snow man!");
                break;
            default:
                System.out.println("I have never heard of this season before");
                break;
        }
    }
}