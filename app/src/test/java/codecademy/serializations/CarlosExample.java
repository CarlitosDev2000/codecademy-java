package codecademy.serializations;
import java.io.*;
public class CarlosExample {
    public static final String ARCHIVO ="C:\\ArchivosParaIDE\\textoDos.txt";
    public static void main(String[] args) {
        try (FileReader fr = new FileReader(ARCHIVO);
             BufferedReader br = new BufferedReader(fr)) {
             String lineaDeTexto;
            while ((lineaDeTexto = br.readLine()) != null) {
                System.out.println(lineaDeTexto);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
