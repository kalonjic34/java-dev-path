public class SwitchStatementsChar {
    public static void main(String[] args) {
        // char grade = 'B';
        // char grade = 'H';
        char grade = 'A';

        switch (grade) {
            case 'A':
            System.out.println("Excellent!");
                break;
            case 'B':
            System.out.println("Good job!");
                break;
            case 'C':
            System.out.println("Well done! ");
                break;
            case 'D':
            System.out.println("Passed!");
                break;
            case 'E':
            System.out.println("Better luck next time!");
                break;
            case 'F':
            System.out.println("You failed, try better next time!");
                break;
            default:
                System.out.println("Grade doesnt exist");
                break;
        }
    }
}