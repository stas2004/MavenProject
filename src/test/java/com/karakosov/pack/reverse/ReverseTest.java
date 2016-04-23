package com.karakosov.pack.reverse;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created  on 26.03.16. by Stas Karakosov
 */
public class ReverseTest {

    private Reverse reverse;

    @Test
    public void reverseArrayInteger() throws Exception {
        reverse = new Reverse();
        Integer[] array1 = {1,2,3,4,5,6,7,8,9,10};
        Integer[] array2 = {10,9,8,7,6,5,4,3,2,1};
        assertArrayEquals(array2, reverse.reverseArray(array1));
    }

    @Test
    public void reverseArrayString() throws Exception {
        reverse = new Reverse();
        String[] array1 = {"One","Two","Three","Four","Five"};
        String[] array2 = {"Five","Four","Three","Two","One"};
        assertArrayEquals(array2, reverse.reverseArray(array1));
    }

    @Test
    public void reverseArrayChar() throws Exception {
        reverse = new Reverse();
        Character[] array1 = {'a','b','c','d'};
        Character[] array2 = {'d','c','b','a'};
        assertArrayEquals(array2, reverse.reverseArray(array1));
    }
}