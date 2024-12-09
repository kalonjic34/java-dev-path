public class TernaryOperators {
    public static void main(String[] args) {
        // condition ? expression1 : expression2;
        int age = 16;
        double discount = (age < 18) ? 0.10 : 0.05;
        System.out.println("This discount is: "+discount*100 +"%");
    
        int score = 85;
        char grade = (score >= 90) ? 'A' 
                : (score >= 80) ? 'B'
                : (score >= 70) ? 'C'
                : (score >= 60) ? 'D'
                : (score >= 50) ? 'E'
                : 'F';
        System.out.println("The grade is "+grade);
    }
}