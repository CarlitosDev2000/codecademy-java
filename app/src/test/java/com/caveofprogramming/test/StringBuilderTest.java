package com.caveofprogramming.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringBuilderTest {
    @Test
    void stringBuilderTest(){

        StringBuilder sb = new StringBuilder();
        sb.append("San Jacinto");
        sb.append(", ");
        sb.append("23 de mayo ");
        sb.append("del 2023.");
        assertEquals("San Jacinto, 23 de mayo del 2023.",sb.toString());
    }
}
