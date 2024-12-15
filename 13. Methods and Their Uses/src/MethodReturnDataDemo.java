public class MethodReturnDataDemo {
    public static void main(String[] args) {
        int value = 5;
        int output = summation(value);
        System.out.println("The summation of "+value+": "+output);
    }
/*
    // define method
    // version 1

    static int summation(int num){
        int result = 0;
        for (int i = 0; i <= num; i++) {
            result+=i;
        }
        return result;
    }
 */

    
    // version 2
    static int summation(int num){
        return num * (num + 1) / 2;
    }
}