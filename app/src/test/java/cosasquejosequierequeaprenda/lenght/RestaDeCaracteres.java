package cosasquejosequierequeaprenda.lenght;

import java.util.Scanner;

public class RestaDeCaracteres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese la primera palabra: ");
        String palabraUno = sc.nextLine();


        System.out.println("ingrese la segunda palabra: ");
        String palabraDos = sc.nextLine();

        int resta = palabraUno.length() - palabraDos.length();

        if (resta > 0) {
            System.out.println("la palabra con mas caracteres es " + palabraUno);
        } else if (resta > 0) {
            System.out.println("la palabra con mas caracteres es " + palabraDos);
        }

        if (resta == 0){
            System.out.println("la palabra " + palabraUno + " tiene la misma cantidad de caracteres que la palabra " + palabraDos);
        } else if (resta > 0) {
            System.out.println("la palabra " + palabraUno + " tiene " + resta + " más caracteres que la palabra " + palabraDos);
        } else if (resta < 0) {
            System.out.println("la palabra " + palabraDos + " tiene " + Math.abs(resta) + " más caracteres que la palabra " + palabraUno);
        }


    }

}
