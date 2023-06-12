package com.caveofprogramming.test;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HashMapTest {
    @Test
    void mapaDeNumerosTest() {
        Map<String, String> diccionario = new HashMap<>();
        diccionario.put("leopardo", "Animal felino");
        diccionario.put("Onitorrinco", "Animal oviparo");
        diccionario.put("Halcon", "animal carroñero");

        for (String key: diccionario.keySet()) {
            System.out.println(key);
            System.out.println(diccionario);
        }
        for (Map.Entry<String, String>  entry: diccionario.entrySet()){
            System.out.println(entry.getKey());
        }
       /* Map<Integer, Boolean> mapaBoolean = new HashMap<>();
        mapaBoolean.put(5, true);
        mapaBoolean.put(6, false);
        mapaBoolean.put(null, true);
        System.out.println(mapaBoolean.get(null));
        Set<Integer> set = new HashSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        Set<Integer> treeSet = new TreeSet<>();
        List<String> nombres = new ArrayList<>();
        List<String> apellidos = new LinkedList<>();
*/

    }

}
