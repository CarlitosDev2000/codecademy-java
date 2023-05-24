package com.caveofprogramming.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WhileLoopTest {
    @Test
    void  whileLoopFail(){
        int value = 5;
        while (value != 5){
            System.out.println("value is not 5");
        }
        assertEquals(5,value);
    }
    @Test
    void  whileLoopSuccess(){
        int value = 0;
        while (value != 5){
            value++;
        }
        assertEquals(5,value);
    }
}
