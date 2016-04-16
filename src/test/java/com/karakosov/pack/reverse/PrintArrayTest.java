package com.karakosov.pack.reverse;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

/**
 * Created  on 26.03.16. by Stas Karakosov
 */
public class PrintArrayTest {

    private ByteArrayOutputStream out;

    @Before
    public void setUp() {
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    private String getOut() {return new String(out.toByteArray()); }

    @Test
    public void printArrayInteger() throws Exception {
        PrintArray <Integer> printArray = new PrintArray <Integer>();
        Integer[] array1 = {1,2,3,4,5,6,7,8,9,10};
        printArray.printArray(array1);
        assertEquals("1 2 3 4 5 6 7 8 9 10 \n", getOut());
    }

    @Test
    public void printArrayString() throws Exception {
        PrintArray <String> printArray = new PrintArray <String>();
        String[] array1 = {"One","Two","Three","Four","Five"};
        printArray.printArray(array1);
        assertEquals("One Two Three Four Five \n", getOut());
    }

    @Test
    public void printArrayCharacter() throws Exception {
        PrintArray <Character> printArray = new PrintArray <Character>();
        Character[] array1 = {'a','b','c','d'};
        printArray.printArray(array1);
        assertEquals("a b c d \n", getOut());
    }
}