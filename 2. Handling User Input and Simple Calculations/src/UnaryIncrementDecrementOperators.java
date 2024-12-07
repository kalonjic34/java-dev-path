public class UnaryIncrementDecrementOperators {
    public static void main(String[] args) {
        // UNARY OPERATORS
        int a =  5;
        int negative = -a;
        System.out.println(negative);

        // Increment Operator (Post Increment)
        int b = a++;
        System.out.println("a is "+a);
        System.out.println("b is "+b);

        // a is 6 
        // Increment Operator (Pre Increment)
        System.out.println("\nPre-Increment");
        b = ++a;
        System.out.println("a is "+a);
        System.out.println("b is "+b);

        // Increment Operator (Pre Decrement)
        System.out.println("\nPre-Decrement");
        b = --a;
        System.out.println("a is "+a);
        System.out.println("b is "+b);

        // Decrement Operator (Pre Decrement)
        System.out.println("\nPre-Decrement");
        b = a--;
        System.out.println("a is "+a);
        System.out.println("b is "+b);


    }
    
}