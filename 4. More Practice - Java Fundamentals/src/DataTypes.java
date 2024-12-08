import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter grade exam 1: ");
        double gradeExam1 = scan.nextDouble();

        System.out.print("Enter grade exam 2: ");
        double gradeExam2 = scan.nextDouble();

        System.out.print("Enter grade exam 3: ");
        double gradeExam3 = scan.nextDouble();

        double gradeAverage = ((gradeExam1 + gradeExam2 + gradeExam3) / 3);

        System.out.println("\nGrade exam 1: "+gradeExam1);
        System.out.println("Grade exam 2: "+gradeExam2);
        System.out.println("Grade exam 3: "+gradeExam3);
        System.out.println("Grade average: "+gradeAverage);
    
        // format the output

        String formattedAvg = String.format("%.2f", gradeAverage);
        System.out.println("Formatted average: "+formattedAvg);
        scan.close();
    }
}