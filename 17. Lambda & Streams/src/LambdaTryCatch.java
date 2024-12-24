public class LambdaTryCatch {
    public static void main(String[] args) {
        Calculate divide = (a,b) -> {
            try {
                return a / b;
            } catch (ArithmeticException e) {
                e.printStackTrace();
                return -1;
            }
        };

        int solution = divide.preform(10, 2);
        System.out.println(solution);
    }
}

@FunctionalInterface
interface Calculate {
    int preform(int a, int b);
}