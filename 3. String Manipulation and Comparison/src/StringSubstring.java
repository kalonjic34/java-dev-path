public class StringSubstring {
    public static void main(String[] args) {
        String phrase = "Programming in Java";
        String word1 = phrase.substring(0,11);
        String word2 = phrase.substring(15);

        System.out.println("Word 1 is: "+word1);
        System.out.println("Word 2 is: "+word2);
    }
}