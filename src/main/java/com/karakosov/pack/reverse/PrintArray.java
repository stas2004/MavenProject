package com.karakosov.pack.reverse;

/**
 * Created  on 26.03.16. by Stas Karakosov
 * @param <T>
 */


public class PrintArray <T> {
    /**
     * Printed array <T> type
     * @param array is printed
     */
    public void printArray(final T[] array) {
        for (T anArray1 : array) {
            System.out.print(anArray1 + " ");
        }
        System.out.println();
    }
}
