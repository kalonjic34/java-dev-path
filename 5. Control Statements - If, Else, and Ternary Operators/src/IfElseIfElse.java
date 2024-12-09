public class IfElseIfElse {
    public static void main(String[] args) {
        
        // int score = 85;
        // int score = 49;
        int score = 64;

        if (score > 90) {
            System.out.println("Grade is A");            
        }else if(score >=85){
            System.out.println("Grade is B");
        }else if(score  >= 70){
            System.out.println("Grade is C");
        }else if(score  >= 60){
            System.out.println("Grade is D");
        }else if(score  >= 50){
            System.out.println("Grade is E");
        }else{
            System.out.println("Grade is F");
        }

    }
}