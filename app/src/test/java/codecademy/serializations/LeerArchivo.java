package codecademy.serializations;
import java.io.*;
import java.util.Properties;
public class LeerArchivo {
    public static final String ARCHIVO ="C:\\ArchivosParaIDE\\textoUno.txt";
    public static void main(String[] args) {
        System.out.println("Escribiendo sobre un archivo de propiedades:");
        try (OutputStream salida = new FileOutputStream(ARCHIVO)) {
            Properties propiedades = new Properties();
            propiedades.setProperty("bd.url", "https://www.youtube.com/watch?v=hGgoVJ8HmfY");
            propiedades.setProperty("bd.usuario", "root");
            propiedades.setProperty("bd.password", "p@ssw0rd");
            propiedades.store(salida, null);
            System.out.println(propiedades);
        } catch (FileNotFoundException e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        }
        System.out.println("\nLeyendo desde un archivo de propiedades:");
        try(InputStream lectura = new FileInputStream(ARCHIVO)){
            Properties propiedades = new Properties();
            propiedades.load(lectura);
            System.out.println("URL: "+ propiedades.getProperty("bd.url"));
            System.out.println("Usuario: "+ propiedades.getProperty("bd.usuario"));
            System.out.println("contraseña: "+ propiedades.getProperty("bd.password"));
        } catch(IOException e){
            System.out.println("Ocurrió un error: " + e.getMessage());
        }
    }
}
