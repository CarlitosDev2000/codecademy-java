package codecademy.generics.practicaUno;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class MainContainerTest {
    @Test
    void testMainContainer(){
        String palabra = "Hello";
        Nombre miNombre = new Nombre("Carlos");
        Container<String> palabraDosContainer = new Container<>(palabra);
        Container<Nombre> nombreDosContainer = new Container<>(miNombre);
        Assertions.assertEquals("Hello", palabraDosContainer.getData());
        Assertions.assertEquals(miNombre, nombreDosContainer.getData());
    }
    @Test
    void testSetName(){
        Nombre miNombreDos = new Nombre("Augusto");
        Container<Nombre> nombreDosContainer = new Container<>(miNombreDos);
        Assertions.assertEquals("Augusto", nombreDosContainer.getData().getName());
        nombreDosContainer.getData().setName("Alex Heldens");
        Assertions.assertEquals("Alex Heldens", nombreDosContainer.getData().getName());
    }
}
