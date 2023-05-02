package codecademy.java.controldos;

import java.util.ArrayList;

public class Ejercicio {
    public static void main(String[] args) {
       Persona carlos = new Persona();
       carlos.setNombre("Carlos");
       carlos.setApellido("Cordova");

        Persona jose = new Persona();
        jose.setNombre("Jose");

        jose.setApellido("Torres");

        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(carlos);
        personas.add(jose);

        personas.remove(0);
        System.out.println(personas.size());

        for (Persona p: personas){
            System.out.println(p.getNombre());
        }




    }
}
