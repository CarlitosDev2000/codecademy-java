package codecademy.serializations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.*;

public class MarioKartSerializationTest {
    @Test
     void testSerializationDeserialization() throws IOException, ClassNotFoundException {
        MarioKartS doubleDash = new MarioKartS("DoubleDash", 6);
        MarioKartS deluxe = new MarioKartS("Deluxe", 8);

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(doubleDash);
        objectOutputStream.writeObject(deluxe);
        objectOutputStream.close();

        byte[] serializedObject = byteArrayOutputStream.toByteArray();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(serializedObject);
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        MarioKartS doubleDashCopy = (MarioKartS) objectInputStream.readObject();
        MarioKartS deluxeCopy = (MarioKartS) objectInputStream.readObject();
        objectInputStream.close();
        Assertions.assertEquals(doubleDash.toString(), doubleDashCopy.toString());
        Assertions.assertEquals(deluxe.toString(), deluxeCopy.toString());
        Assertions.assertFalse(doubleDashCopy == deluxeCopy);
    }
}