public class RecursionDemo {
    public static void main(String[] args) {
        int value = 5;
        int output = factorial(value);
        System.out.println("Factorial of "+value+": "+output);
    }

    // define method
    static int factorial(int num){
        // base case: 0! = 1
        if (num==0) {
            return 1;
        }else{
            // recursive case: num! = num * (num -1)!
            return num * factorial(num-1);
        }

    }
}