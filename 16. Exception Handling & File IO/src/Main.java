public class Main {
    public static void main(String[] args) {
        // String numberString = "32";
        // parseString("love2code");
        // parseString(null);
        parseString("32");

    }

        public static void parseString(String numberString){
            try {
                int numberInt = Integer.parseInt(numberString);
                System.out.println(numberInt);  
            } 
            catch (NumberFormatException | NullPointerException e) {
                System.out.println("String needs to be a valid int.");
            } 
            catch(Exception e){
                System.out.println(e);
            }
            finally{
                System.out.println("In the finally block.");
            }
    } 
}
