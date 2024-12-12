public class DeclarationInitialization {
    public static void main(String[] args) {
        int[][] my2DArray = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };


        System.out.println("My2d Array length: "+my2DArray.length);

        for (int[] rows : my2DArray) {
            //  iterates through columns
            for (int num : rows) {
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}