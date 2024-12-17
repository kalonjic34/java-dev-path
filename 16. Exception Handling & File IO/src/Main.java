import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        FileReader fileReader = null;

        try{
            // connect to a new file
            fileReader = new FileReader("story.txt");

            // -1 means the file ends
            int character = 0;
            while ((character = fileReader.read()) != - 1 ){
                System.out.println((char)character);
            }
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
        finally{
            if (fileReader != null) {
                fileReader.close();
            }
        }
    }
}
