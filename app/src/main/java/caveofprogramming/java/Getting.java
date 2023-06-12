package caveofprogramming.java;

import java.util.Scanner;

public class Getting {
    public static void main(String[] args) {
        //creamos el objeto scanner
        Scanner sabado = new Scanner(System.in);
        Scanner domingo = new Scanner(System.in);
        //avisamos
        System.out.println("Escribe el siguiente numero : ");

        int value = sabado.nextInt();

        //avisamos al usuario que escriba algo
        System.out.println("Escribe la siguiente palabra");

        String valueDos = domingo.nextLine();

        //imprimimos los valores
        System.out.println("imprimiste el numero " + value + " y la palabra " + valueDos);
    }
}
