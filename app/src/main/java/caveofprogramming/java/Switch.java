package caveofprogramming.java;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Por favor escribe el comando: ");

        String text = input.nextLine();

        switch (text){
            case "start":
                System.out.println("La maquina encendio");
                break;

            case "stop":
                System.out.println("la maquina se detuvo");
                break;

            default:
                System.out.println("Comando no reconocido");

        }
    }
}
