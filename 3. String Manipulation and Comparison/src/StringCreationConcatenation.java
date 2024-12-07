public class StringCreationConcatenation {
    public static void main(String[] args) {
        String morning = "Good Morning";
        System.out.println(morning);

        String night = new String("Good night");
        night = "Good Night";
        System.out.println(night);

        String firstName = "Chris ";
        String lastName = "Kalonji";
        // String concatination
        String fullName = firstName +lastName;
        int age = 30; 
        String bio = "I am "+ fullName+ " and i'm "+age+" years old";
        System.out.println(bio);
    }
}