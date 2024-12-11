public class ArraySumMinMax {
    public static void main(String[] args) {
        int[] numbers = {1,22,33,45,5,7,0};

        int sum = 0;
        int max = numbers[0];
        int min = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
            sum += number;
        }
        System.out.println("Sum is: "+sum);
        System.out.println("Max is: "+max);
        System.out.println("Min is: "+max);
    }
}