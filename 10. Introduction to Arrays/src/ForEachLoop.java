public class ForEachLoop {
    public static void main(String[] args) {
        int[] numbers = {1,22,33,45,5,7};
        System.out.println("Array length is: "+numbers.length);
        int counter = 0;
        for (int number : numbers) {
            System.out.println("Counter is at: "+counter++);
            System.out.println(number);
        }

        String[] friends = {"Mark", "Sam", "Liam", "Alice"};

        for (String friend : friends) {
            System.out.println("Please come to my party: "+friend);
            System.out.println("Welcome to my party: "+friend);
        }
    }
}