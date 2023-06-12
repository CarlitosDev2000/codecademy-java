package caveofprogramming.java;
import java.util.Scanner;
public class If {
    public static void main(String[] args) {
        Scanner pi = new Scanner(System.in);
        int pe = pi.nextInt();

        if (pe < 30){
            System.out.println(pe + " es menor que 30");
        } else if(pe <= 300){
            System.out.println(pe + " es mayor que 30");
        } else if(pe == 30){
            System.out.println( " es 30");
        }else{
            System.out.println("Error");
        }

        int loop = 0;
        while (true) {
            System.out.println("looping " + loop);
            if (loop == 5) {
                break;
            }
            loop++;
            System.out.println("running");
        }
    }
}
