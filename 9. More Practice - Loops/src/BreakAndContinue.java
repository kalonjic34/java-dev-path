public class BreakAndContinue {
    public static void main(String[] args) {
        // example using break
        for (int i = 0; i <= 10; i++) {
            
            if (i == 5) {
                break;
                // break loop at 5
            }
            System.out.println("Counter: "+i);
        }

        System.out.println();

        // example using continue

        for (int i = 0; i <= 10; i++) {
            
            if (i == 5) {
                continue;
                // at 5, continue skip remaining statements in current iteration
            }
            System.out.println("Counter: "+i);
        }
    }
}