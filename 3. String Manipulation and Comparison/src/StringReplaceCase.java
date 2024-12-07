public class StringReplaceCase {
    public static void main(String[] args) {
        String phrase = "The quick brown fox";

        String newPhrase = phrase.replace('o', 'a');

        System.out.println("Word 1 is: "+newPhrase);
        System.out.println("Word 2 is: "+newPhrase);

        String upperCaseString = phrase.toUpperCase();
        System.out.println("Capitalized Phrase "+upperCaseString);

        String lowerCaseString = phrase.toLowerCase();
        System.out.println("Lower Case Phrase "+lowerCaseString);
    }
}