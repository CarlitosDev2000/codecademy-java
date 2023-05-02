package practicandoarraysyloops;

public class Pasa {
    public static void main(String[] args) {
        Object[] paneton = {300, true, "pasas"};
        paneton[0] = 500;
        System.out.println(paneton[0]);

        int[] miArray = {10, 20, 30, 40, 50};

// Asignar un valor al tercer elemento del array
        miArray[2] = 35;

// Leer el valor del segundo elemento del array y mostrarlo en pantalla
        int valor = miArray[2];
        System.out.println("El valor del segundo elemento es: " + valor);
    }
}
