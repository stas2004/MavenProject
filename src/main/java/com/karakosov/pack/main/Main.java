package com.karakosov.pack.main;

import com.karakosov.pack.MyException.ArraySizeException;
import com.karakosov.pack.reverse.ArrayValues;
import com.karakosov.pack.reverse.CreateArray;
import com.karakosov.pack.reverse.PrintArray;
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
        CreateArray createArray = new CreateArray();
        ArrayValues <Integer> arrayValues = new ArrayValues<Integer>();
        PrintArray <Integer>printedArray = new PrintArray<Integer>();
        try {
            arrayValues.setArrayValues(createArray.createArray(VALUE));
            printedArray.printArray(arrayValues.getArrayValues());
        } catch (NegativeArraySizeException e) {
            throw new ArraySizeException(e);
        }

        Reverse reverse = new Reverse();
        try {
            arrayValues.setArrayValues(reverse.reverseArray(arrayValues.getArrayValues()));
            printedArray.printArray(arrayValues.getArrayValues());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.print("Array is not changed!");
        }
    }
}

