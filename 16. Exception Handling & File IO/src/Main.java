import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        try{
            readFile();
        } catch(FileNotFoundException e){
            System.out.println(e);
        }
    }  
    public static void readFile() throws FileNotFoundException{
        FileReader fileReader = new FileReader("file.txt");

    }
}
