public class DeclarationInitialization {
    public static void main(String[] args) {
        int[][] my2DArray = {
            {1,2,3},
            {4,5,6},
            {7,8,9,10,11,12,13,0}
        };

        int largest = my2DArray[0][0];
        int lowest = my2DArray[0][0];
        for (int[] rows : my2DArray) {
            //  iterates through columns
            for (int num : rows) {
                if (num > largest) {
                    largest = num;
                }
                if (num < lowest) {
                    lowest = num;
                }
            }
        }
        System.out.println("Large number is: "+largest);
        System.out.println("Lowest number is: "+lowest);
    }
}