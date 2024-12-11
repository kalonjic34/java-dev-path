import java.util.Arrays;

public class ArrayBinarySearchMethod {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7,3,8};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int index = Arrays.binarySearch(nums, 6);
        System.out.println("Index of 6 is at "+index);
    }
}