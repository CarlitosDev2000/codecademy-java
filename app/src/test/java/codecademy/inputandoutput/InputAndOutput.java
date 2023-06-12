package codecademy.inputandoutput;

import java.util.Scanner;

public class InputAndOutput {
    public static void main(String[] args) {
        Scanner nuevo = new Scanner(System.in);

        String name = nuevo.nextLine();
        System.out.println("Mi nombre es " + name);
        int codigo = nuevo.nextInt();

        char clase = nuevo.next().charAt(0);
        System.out.printf("tu codigo es: %d, del salon %s", codigo, clase);


    }
}
