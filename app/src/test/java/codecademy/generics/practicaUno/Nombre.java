package codecademy.generics.practicaUno;

public class Nombre {
    private String name;
    public Nombre(String name) {
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public String toString() {
        return "Nombre(name = \"" + this.name + "\")";
    }
}

