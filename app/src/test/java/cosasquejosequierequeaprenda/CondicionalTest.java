package cosasquejosequierequeaprenda;

public class CondicionalTest {
    public static void main(String[] args) {
        int edad = 22;
        if (edad < 18){
            System.out.println("Es un niño");
        } else if (edad >= 18 && edad<60 ) {
            System.out.println("Es una adulto");
        } else {
            System.out.println("Es un anciano");
        }
    }
}
