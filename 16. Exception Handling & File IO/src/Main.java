import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{

        try(BufferedWriter writer = new BufferedWriter(new FileWriter("file.txt"))) {
            writer.write("Hello World!");
            writer.newLine();
            writer.write("This is a simple text file");
        } catch (IOException e) {
            System.out.println(e);
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("story.txt"))){
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
