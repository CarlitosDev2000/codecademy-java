package cosasquejosequierequeaprenda.lenght;

import java.util.Scanner;

public class restaDeCaracteres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese el primer nombre: ");
        String nombre = sc.nextLine();
        System.out.println("el primer nombre tiene " + nombre.length() + " caracteres");

        System.out.println("ingrese el segundo nombre: ");
        String nombreDos = sc.nextLine();
        System.out.println("el segundo nombre tiene " + nombreDos.length() + " caracteres");

        int resta = nombre.length() - nombreDos.length();

        System.out.println("la resta de los dos caracteres es igual a: " + resta);


    }

}
