public class StringLengthCharAt {
    public static void main(String[] args) {
        // String quote = "To be or not to be";
        String quote = "May the forth be with you";
        int length = quote.length();
        System.out.println(length);

        // charAt(index) Where index is the psoition of the character within the string
        char firstChar = quote.charAt(0);
        char tenthChar = quote.charAt(9);

        System.out.println("the first charcter is "+firstChar);
        System.out.println("the tenth charcter is "+tenthChar);
    }
}