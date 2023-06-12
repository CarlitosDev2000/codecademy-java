package codecademy.serializations;
import java.io.Serializable;
    public class SerializationExampleOne implements Serializable{
        private String make;
        private int year;
        private static final long serialVersionUID = 1L;
        public SerializationExampleOne (String make, int year) {
            this.make = make;
            this.year = year;
        }
    }

