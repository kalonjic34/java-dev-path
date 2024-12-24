public class FirstLambda {
    public static void main(String[] args) {
        Greetings lambda = (n) -> System.out.println(n);
        lambda.greetings("Hello Java Developers!");
    }
}

@FunctionalInterface
interface Greetings {
    void greetings(String greeting);
}