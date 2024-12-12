public class DeclarationInitialization {
    public static void main(String[] args) {
        int[][] my2DArray = new int[3][3];
        my2DArray[0][0] = 1;
        my2DArray[0][1] = 2;
        my2DArray[0][2] = 3;
        my2DArray[1][0] = 4;
        my2DArray[1][1] = 5;
        my2DArray[1][2] = 6;
        my2DArray[1][0] = 7;
        my2DArray[2][1] = 8;
        my2DArray[2][2] = 9;

        System.out.println("My2d Array length: "+my2DArray.length);

        for (int i = 0; i < my2DArray.length; i++) {
            for (int j = 0; j < my2DArray[i].length; j++) {
                System.out.print(my2DArray[i][j]+" ");
            }
            System.out.println();
        }
    }
}