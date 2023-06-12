package codecademy.serializations;
import java.io.*;
public class MarioKart implements Serializable {
    private String serie;
    private int numero;
    private static final long serialVersionUID = 1L;
    public MarioKart(String serie, int numero) {
      this.serie = serie;
      this.numero = numero;
    }
public String toString(){
        return String.format("la serie de ese juego de Mario kart es : %s, El numero de serie seria el: %d", this.serie, this.numero);
    }
    public static void main(String[] args) throws  IOException, ClassNotFoundException {
        MarioKart doubleDash = new MarioKart("DoubleDash", 6);
        MarioKart deluxe = new MarioKart("Deluxe", 8);
        FileOutputStream fileOutputStream = new FileOutputStream("MarioKart. txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(doubleDash);
        objectOutputStream.writeObject(deluxe);

        FileInputStream fileInputStream = new FileInputStream("Mariokart.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        MarioKart doubleDashCopy = (MarioKart) objectInputStream.readObject();
        MarioKart deluxeCopy = (MarioKart) objectInputStream.readObject();
        boolean isSameObject = doubleDashCopy == deluxeCopy;
      //  Integer.parseUnsignedInt("hola");
        System.out.println();
        System.out.println("DoubleDash(copy) : " + doubleDashCopy);
        System.out.println("Deluxe(copy) : " + deluxeCopy);
        System.out.println("¿Es el mismo juego?" );
        if (doubleDashCopy == deluxeCopy) {
            System.out.println("Los juegos son iguales.");
        }else {
        System.out.println("Los juegos son distintos.");
        }
    }
}
