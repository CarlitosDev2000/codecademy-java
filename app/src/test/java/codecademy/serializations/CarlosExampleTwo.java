package codecademy.serializations;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class CarlosExampleTwo {
    @Test
    public void testLeerArchivoTexto () {
        String nombreArchivo = "C:\\ArchivosParaIDE\\textoDos.txt";
        StringBuilder contenidoEsperado = new StringBuilder();
        try (FileReader fr = new FileReader(nombreArchivo);
             BufferedReader br = new BufferedReader(fr)) {

            String linea;
            while ((linea = br.readLine()) != null) {
                //System.out.println(linea);
                contenidoEsperado.append(linea).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String contenidoActual = contenidoEsperado.toString();
        System.out.println(contenidoEsperado);
        assertEquals(contenidoEsperado.toString(), contenidoActual);
    }
}

