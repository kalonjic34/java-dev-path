import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean isSunny = true;
        if (isSunny) {
            System.out.println("Such a lovely day!\n");
        }

        int a = -5;
        if (a > 0) {
            System.out.println("We have a positive number");
        }
        System.out.println("Outside of any conditions!\n");

        String name = scan.nextLine();
        if(name.equals("Chris")){
            System.out.println("Hi Chris");
        }

        scan.close();
    }

}