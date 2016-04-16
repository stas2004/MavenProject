package com.karakosov.pack.reverse;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created  on 26.03.16. by Stas Karakosov
 */
public class ArrayValuesTest {


    @Test
    public void setGetArrayValuesInteger() throws Exception {
        ArrayValues <Integer> arrayValues = new ArrayValues <Integer>();
        Integer[] array1 = {1,2,3,4,5,6,7,8,9,10};
        arrayValues.setArrayValues(array1);
        assertArrayEquals(arrayValues.getArrayValues(),array1);
    }

    @Test
    public void setGetArrayValuesString() throws Exception {
        ArrayValues <String> arrayValues = new ArrayValues <String>();
        String[] array1 = {"One","Two","Three","Four","Five"};
        arrayValues.setArrayValues(array1);
        assertArrayEquals(arrayValues.getArrayValues(),array1);
    }

    @Test
    public void setGetArrayValuesCharacter() throws Exception {
        ArrayValues <Character> arrayValues = new ArrayValues <Character>();
        Character[] array1 = {'a','b','c','d'};
        arrayValues.setArrayValues(array1);
        assertArrayEquals(arrayValues.getArrayValues(),array1);
    }
}