package com.karakosov.pack.main;

import com.karakosov.pack.MyException.ArraySizeException;
import com.karakosov.pack.reverse.ArrayValues;
import com.karakosov.pack.reverse.CreateArray;
import com.karakosov.pack.reverse.Reverse;

/**
 * Created  on 26.03.16 by Stas Karakosov
 */
public final class Main {
    /**
     * Default constructor
     */
    private Main() {
    }
    /**Length of the array*/
    private static final Integer VALUE = 50;
    /**
     *Main method
     * @param args incoming arguments
     * @throws Exception generated at improper transmission parameter to the constructor class Reverse
     */

    public static void main(final String[] args) throws Exception {
        /**
         * array is array of Integer
         */
        Integer[] array;

        CreateArray createArray = new CreateArray();
        try {
            array = createArray.createArray(VALUE);
            for (int anArray1 : array) {
                System.out.print(anArray1 + " ");
            }
        } catch (NegativeArraySizeException e) {
            throw new ArraySizeException(e);
        }

        System.out.println();
        Reverse reverse = new Reverse();
        ArrayValues <Integer> arrayValues = new ArrayValues<Integer>();
        try {
            array = reverse.reverseArray(array);
            arrayValues.setArrayValues(array);
            for (Integer anArray : arrayValues.getArrayValues()) {
                System.out.print(anArray + " ");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.print("Array is not changed!");
        }
    }
}

