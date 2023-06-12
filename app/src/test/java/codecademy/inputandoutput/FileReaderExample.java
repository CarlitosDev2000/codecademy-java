package codecademy.inputandoutput;
import java.io.FileReader;
import java.io.IOException;
public class FileReaderExample {

    public class Introduction {
        public static void main(String[] args) throws IOException {
            String path = "\u202AC:\\Users\\carlo_r9z2q3v\\Downloads\\carlos.txt";
            FileReader reader = new FileReader(path);
            int counter = 0;
            while((counter = reader.read()) != -1) {
                System.out.print((char)counter);
            }
            reader.close();
        }
    }
}
