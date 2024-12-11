import java.util.Arrays;

public class ArraysToStringAndSortMethods {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7,3,8};
        String[] names = {"Frank", "Sam", "Liam"};
        System.out.println("Pre sorting "+Arrays.toString(nums));
        System.out.println(Arrays.toString(names));
        Arrays.sort(nums);
        System.out.println("Post sorting "+Arrays.toString(nums));
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
    }
}