import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayListMethod {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(167,210,500,320, 870,210,10));
        
        System.out.println(numbers.size());
        System.out.println(numbers.contains(210));
       
        System.out.println(numbers.containsAll(List.of(167, 320)));
        System.out.println(numbers.indexOf(500));
        
        System.out.println(numbers.indexOf(509));
        System.out.println(numbers.indexOf(210));
        
        System.out.println(numbers.lastIndexOf(210));
        System.out.println(numbers.remove(6));

        System.out.println(numbers.retainAll(List.of(167, 320)));

        numbers.sort(Comparator.naturalOrder());
        
        numbers.sort(Comparator.reverseOrder());

        for (Integer i : numbers) {
            System.out.println(i);
        }

        numbers.clear();

        System.out.println(numbers.isEmpty());  
        
    }
}