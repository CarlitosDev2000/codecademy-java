package com.caveofprogramming.test;
import org.junit.jupiter.api.Test;
import java.util.LinkedList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedLinkTest {
        @Test
        void listaDeFrutasTest () {
            List<String> lista = new LinkedList<>();
            lista.add("Manzana");
            lista.add("Banana");
            lista.add("Naranja");
            assertEquals(3, lista.size());
            assertEquals("Manzana", lista.get(0));
            assertEquals("Banana", lista.get(1));
            assertEquals("Naranja", lista.get(2));
            lista.remove(1);
            assertEquals(2, lista.size());
            assertEquals("Manzana", lista.get(0));
            assertEquals("Naranja", lista.get(1));
        }
    }

