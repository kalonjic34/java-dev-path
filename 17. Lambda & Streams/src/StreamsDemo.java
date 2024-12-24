import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class StreamsDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Eric", "Melissa", "Sam", "Milo", "Alice");
        List<String> result = names.stream()
                .filter(s -> s.length() <= 6)
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());
        result.forEach(System.out::println);
    }
}