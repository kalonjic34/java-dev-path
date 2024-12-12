public class DeclarationInitialization {
    public static void main(String[] args) {
        int[][] my2DArray = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };


        System.out.println("My2d Array length: "+my2DArray.length);

        for (int i = 0; i < my2DArray.length; i++) {
            //  iterates through columns
            for (int j = 0; j < my2DArray[i].length; j++) {
                System.out.print(my2DArray[i][j]+" ");
            }
            System.out.println();
        }
    }
}