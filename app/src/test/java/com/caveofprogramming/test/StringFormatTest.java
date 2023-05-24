package com.caveofprogramming.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringFormatTest {
    @Test
    void stringFormatEqualsTest(){

        String nameAndAge = String.format("name: %s, age: %d","Carlos",23);
        assertEquals("name: Carlos, age: 23",nameAndAge);

    }
    @Test
    void stringFormatDateTest(){
        String cityAndDate = String.format("%s, %d de %s del %d.","San Jacinto",23,"mayo",2023);
        assertEquals("San Jacinto, 23 de mayo del 2023.",cityAndDate);
        assertNotNull(cityAndDate);
        assertEquals(33,cityAndDate.length());
        assertNotEquals(0,cityAndDate.length());

    }


}
