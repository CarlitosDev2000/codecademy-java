package caveofprogramming.java.classesandobjects;



    class PersonTwo{
        String nombre;
        int edad;

        void speak() {
            System.out.println("Mi nombre es " + nombre );
        }
        int calcularAñosParaRetirarse(){
            int faltan = 65 - edad;
            System.out.println(faltan);
            return  faltan;
        }
        int getEdad(){
            return  edad;
        }
        String getNombre(){
            return nombre;
        }
    }
public class RedFruit {
    public static void main(String[] args) {
        PersonTwo personaUno = new PersonTwo();

        personaUno.nombre= "Carlos";
        personaUno.edad= 23;

        personaUno.speak();
        int años = personaUno.calcularAñosParaRetirarse();
        System.out.println("te faltan " + años +" años para retirarse");
    }
}