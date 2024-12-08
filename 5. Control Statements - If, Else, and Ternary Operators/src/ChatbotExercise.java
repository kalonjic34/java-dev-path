import java.util.Scanner;

public class ChatbotExercise  {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your prompt: ");
        String userInput = scan.nextLine();
        if (userInput.equalsIgnoreCase("hello") || userInput.equalsIgnoreCase("hi")) {
            System.out.println("Chatbot: Hello there, how are you?");
        }
        
        if (userInput.equalsIgnoreCase("how are you?") || userInput.equalsIgnoreCase("how's it going?")) {
            System.out.println("Chatbot: I'm just a robot and have no feelings");
        }
        
        if (userInput.equalsIgnoreCase("weather") || userInput.equalsIgnoreCase("what's the weather like?")) {
            System.out.println("Chatbot: It's a sunny day");
        }
        
        if (userInput.equalsIgnoreCase("bye") || userInput.equalsIgnoreCase("goodbye")) {
            System.out.println("Chatbot: Bye, have a great day!");
        }

        if (!userInput.equalsIgnoreCase("hello") 
        || !userInput.equalsIgnoreCase("hi") 
        || !userInput.equalsIgnoreCase("how are you?") 
        || !userInput.equalsIgnoreCase("how's it going?") 
        || !userInput.equalsIgnoreCase("weather") 
        || !userInput.equalsIgnoreCase("what's the weather like?")
        || !userInput.equalsIgnoreCase("bye") 
        || !userInput.equalsIgnoreCase("goodbye")) {
            System.out.println("Chatbot: Sorry, i didnt get it");
        }
        scan.close();
    }
}