import java.util.Scanner;

public class ComputeGradeAverageDemo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("How many grades will you enter: ");
        int numGrades = scan.nextInt();
        
        System.out.println();

        // initialize the array based on the number of grades
        double[] userInputGrades = new double[numGrades];

        // read each grade and assign to an array element
        for (int i = 0; i < userInputGrades.length; i++) {
            System.out.print("Enter grade number: "+(i+1)+": ");
            userInputGrades[i] = scan.nextDouble();
        }

        System.out.println();

        // print out the array elements
        for (double temp : userInputGrades) {
            System.out.println(temp);
        }

        System.out.println();

        // compute average
        double gradeAverage = ComputeGradeAverage(userInputGrades);
        System.out.println("Grade average: "+gradeAverage);
        
        scan.close();
        
    }
        
        private static double ComputeGradeAverage(double[] userInputGrades) {
            
            double sum = 0.0;

            // compute the sum of the grades
            for (double temp : userInputGrades) {
                sum += temp;
            }

            // compute the grade average, based on the length of the array
            double average = sum / userInputGrades.length;
            
            return average;
         }
}