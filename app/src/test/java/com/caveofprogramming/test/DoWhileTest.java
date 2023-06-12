package com.caveofprogramming.test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DoWhileTest {
    @Test
    void  doWhileSuccess(){
        int value = 5;
        do {
            System.out.println("in loop");
        }
        while (value != 5);
        assertEquals(5,value);

    }
}
