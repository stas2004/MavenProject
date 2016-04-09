package com.karakosov.pack.reverse;

import com.karakosov.pack.InterfaceReverse.IReverseArray;

/**
 * Created  on 26.03.16 by Stas Karakosov
 *
 */
public class Reverse  implements IReverseArray {

    /**
     * Default constructor
     */
    public Reverse() {

    }

    /**
     *
     * reverse_Array() is reverse of <T> type array.
     * @return reversed array of <T> type
     */



    /**
     *
     * @param array is array <T> type
     * @param <T> type
     * @return reversed array of <T> type
     */
    public  <T> T[] reverseArray(final T[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            T tmp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tmp;
        }
        return array;
    }
}
