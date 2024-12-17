public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        // String numberString = "32";
        String numberString = "love2code";

        try {
            int numberInt = Integer.parseInt(numberString);
            System.out.println(numberInt);  
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}