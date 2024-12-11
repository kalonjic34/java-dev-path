import java.util.Arrays;

public class ArrayBinarySearchMethod {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7,3,8};
        System.out.println("nums: "+Arrays.toString(nums));
        int[] notReallyAbackupOfNums = nums; // by Reference 
        int[] backupOfNums = Arrays.copyOf(nums, nums.length);
        int[] lessNums= Arrays.copyOf(nums, 5);
        
        Arrays.sort(nums); // sorts nums array
        System.out.println("nums: "+Arrays.toString(nums));
        System.out.println("Backup of nums: "+Arrays.toString(backupOfNums));
        System.out.println("lessNums: "+Arrays.toString(lessNums));
    }
}