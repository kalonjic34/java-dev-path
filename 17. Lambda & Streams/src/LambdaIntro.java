import java.util.ArrayList;
import java.util.List;

public class LambdaIntro {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Eric");
        names.add("Melissa");
        names.add("Sam");
        names.add("Milo");

        names.forEach((n) -> System.out.println(n));
    }    
}