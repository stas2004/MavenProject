package com.karakosov.pack.reverse;

/**
 * Created  on 26.03.16 by Stas Karakosov
 * Class create array of Integer
 */
public class CreateArray {
    /**
     *
     * @param lengthArray is length to created array
     * @return created array of integer
     */
    public final Integer[] createArray(final int lengthArray) {
        Integer[] array = new Integer[lengthArray];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        return  array;
    }

}
