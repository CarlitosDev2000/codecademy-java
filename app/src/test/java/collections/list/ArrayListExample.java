package collections.list;
import collections.Persona;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
       Map<String, String> map = new LinkedHashMap<>();
       map.put("xTwo","xDos");
       map.put("xThree","xTres");
       map.put("xOne","xUno");
        String[] keys = map.keySet().toArray(new String[0]);
        System.out.println(keys[2]);
        // get an array of values of the `HashMap`
        String[] values = map.values().toArray(new String[0]);
        
    }
}
