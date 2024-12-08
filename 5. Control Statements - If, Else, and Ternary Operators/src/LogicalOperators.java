public class LogicalOperators {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // double ampersand
        // Logical AND
        // a and b are true than the result of logical is AND will be true
        // a false, b true - > false
        // a false, b false - > false
        // a true, b true - > false
        boolean result = a && b; // false
        // LOGICAL OR Operator
        result = a || b; // true
        result = !a || b; // true
        System.out.println("a is "+a+" and is !a is "+!a+"\n");
        
        int x = 5; 
        int y = 10;
        if (x > 0 && y > x) {
            System.out.println("y is greater than x");
        }
    }
}