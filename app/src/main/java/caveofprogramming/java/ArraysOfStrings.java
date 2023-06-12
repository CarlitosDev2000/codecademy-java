package caveofprogramming.java;

public class ArraysOfStrings {
    public static void main(String[] args) {
        String[] palabra = new String[3];

        palabra[0]="Hello";
        palabra[1]="to";
        palabra[2]="you";

        System.out.println(palabra[2]);

        String[] frutas = {"manzana","platano","pera","kiwi"};

        for (String fruta : frutas){
            System.out.println(fruta);
        }
        int valor = 0;
        String texto = null;
        System.out.println(texto);
        String[] textos = new String[2];
        System.out.println(textos[0]);
    }
}
