public class BreakKeyword {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("We Gotcha!!");
                break;
            }
            System.out.println(i);
        }
        System.out.println("After the for loop");
    }
}