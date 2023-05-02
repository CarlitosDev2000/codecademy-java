package codecademy.java.twodarrays;

import java.util.ArrayList;
import java.util.List;

public class Project {



    public static void main(String[] args) {

        int[] ints = new int[10];
        ints[0] = 4;

        System.out.println(ints[0]);
        System.out.println(ints[9]);

        List<Integer> integerList = new ArrayList<>();//interface
        integerList.add(4);
        System.out.println(integerList.get(0));


        for (int i=0;i < 5;i++){
            System.out.println(i);
        }
        int x = 0;
        while (x <= 10){
            System.out.println(x);
            x++;
        }

        for(int cosa :ints){
            System.out.println(cosa);
        }
    }
}
