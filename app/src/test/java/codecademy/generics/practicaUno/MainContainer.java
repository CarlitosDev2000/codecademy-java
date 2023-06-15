package codecademy.generics.practicaUno;

public class MainContainer {
    public static void main(String[] args) {
        String palabra = "Hello";
        Nombre miNombre = new Nombre("Carlos");
        Container<String> palabraContainer = new Container<>(palabra);
        Container<Object> nombreContainer = new Container<>(miNombre);
        palabraContainer.setData("Augusto");
        System.out.println(palabraContainer.getData());
        System.out.println(nombreContainer.getData());
        System.out.println(palabraContainer.getData());
    }
}
