public class MethodDemo {
    public static void main(String[] args) {
        // call the medthod
        
        // displayManyGreetings(3);
        displayGreetings(3);
    }

    static void displayGreetings(int count){
        for (int i = 0; i <= count; i++) {
            displayGreetings();
            System.out.println();
        }
    }

    //define the method
    static void displayGreetings(){
        System.out.println("Hello world!");
        System.out.println("Welcome, welcome.");
        System.out.println("Please make yourself at home.");
    }
}