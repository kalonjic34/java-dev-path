public class ArrayLengthAndForLoops {
    public static void main(String[] args) {
        int[] numbers = {1,22,33,45,5,7};
        System.out.println("Array length is: "+numbers.length);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 2;
            System.out.println(numbers[i]);
        }
    }
}