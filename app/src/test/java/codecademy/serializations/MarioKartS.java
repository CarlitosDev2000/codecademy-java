package codecademy.serializations;

import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MarioKartS implements Serializable {
    private String serie;
    private int numero;
    private static final long serialVersionUID = 1L;
    public MarioKartS(String serie, int numero) {
        this.serie = serie;
        this.numero = numero;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException {
       MarioKartS doubleDash = new MarioKartS("DoubleDash",6);
       MarioKartS deluxe = new MarioKartS("Honda", 8);

        FileOutputStream fileOutputStream = new FileOutputStream("MarioKartS.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(doubleDash);
        objectOutputStream.writeObject(deluxe);
    }
}