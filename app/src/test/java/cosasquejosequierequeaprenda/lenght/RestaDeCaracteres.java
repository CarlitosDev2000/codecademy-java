package cosasquejosequierequeaprenda.lenght;

import java.util.Scanner;

public class RestaDeCaracteres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese el primer nombre: ");
        String palabraUno = sc.nextLine();


        System.out.println("ingrese el segundo nombre: ");
        String palabraDos = sc.nextLine();

        int resta = palabraUno.length() - palabraDos.length();

        if (palabraUno.length()>palabraDos.length()) {
            System.out.println("la palabra con mas caracteres es " + palabraUno);
        } else if (palabraDos.length()>palabraUno.length()) {
            System.out.println("la palabra con mas caracteres es " + palabraDos);
        }

        if (resta == 0){
            System.out.println("la palabra " + palabraUno + " tiene la misma cantidad de caracteres que la palabra " + palabraDos);
        } else if (resta > 0) {
            System.out.println("la palabra " + palabraUno + "tiene " + resta + " mas caracteres que la palabra " + palabraDos);
        } else if (resta < 0) {
            System.out.println("la palabra " + palabraDos + " tiene " + Math.abs(resta) + " mas caracteres que la palabra " + palabraUno);
        }


    }

}
