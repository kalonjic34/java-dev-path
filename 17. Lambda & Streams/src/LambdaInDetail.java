import java.util.function.Predicate;

public class LambdaInDetail {
    public static void main(String[] args) {
        StringEndings execlamationMark = (s) -> s +"!";
        System.out.println(execlamationMark.preform("Hello"));
        
        String a  = "Milo";
        String b  = "Tester";

        StringCompare value = (s1, s2) -> {
            if (s1.length() > s2.length()) {
                return s1;
            }
                return s2;
        };

        String longerWord = value.preform(a, b);
        System.out.println(longerWord);

        Predicate<Integer> lessThan100 = i -> (i<100);
        Predicate<Integer> greaterThan100 = i -> (i>50);
        
        boolean result = lessThan100.and(greaterThan100).test(101);
        boolean result1 = lessThan100.negate().test(101);
        System.out.println(result);
        System.out.println(result1);
    }
}

@FunctionalInterface
interface StringEndings {
    String preform(String s);
}

@FunctionalInterface
interface StringCompare {
    String preform(String s1, String s);
}