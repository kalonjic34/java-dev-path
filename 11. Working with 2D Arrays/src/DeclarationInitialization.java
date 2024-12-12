public class DeclarationInitialization {
    public static void main(String[] args) {
        int[][] my2DArray = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

            int sum = 0;
    // iterates through rows
        for (int[] rows : my2DArray) {
            //  iterates through columns
            for (int num : rows) {
                sum += num;
            }
        }
        System.out.println("Sum is: "+sum);
    }
}