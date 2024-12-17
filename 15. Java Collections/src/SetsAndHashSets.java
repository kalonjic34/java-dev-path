import java.util.HashSet;
import java.util.List;
// import java.util.Set;

public class SetsAndHashSets {
    public static void main(String[] args) {
        var books = new HashSet<String>(List.of("Computer Software", "Computer Hardware"));
        books.add("Demo book");
        books.add("Harry and his friends");
        books.add("Eric takes on photography");
        books.add("Chad loves Java");
        books.add("Always be learning");
       
        System.out.println(books.contains("Harry and his friends"));
        System.out.println(books.size());
        // books.remove("Eric takes on photography");

        for (String book : books) {
            System.out.println(book);
        }
    }
}