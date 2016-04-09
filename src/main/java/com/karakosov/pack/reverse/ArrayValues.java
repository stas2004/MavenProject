package com.karakosov.pack.reverse;

/**
 * Created  on 26.03.16. by Stas Karakosov
 * Class used for the storage array
 * @param <T> type
 */


public class ArrayValues <T>  {
    /**
     * is array <T> type
     */
    private T[] array;

    /**
     * Method setArrayValues() changes the values ​​of the array
     * @param inArray array <T> type
     */
    public void setArrayValues(final T[] inArray) {
        this.array = inArray;
    }

    /**
     * Method getArrayValues() return the array <T> type
     * @return array <T> type
     */
    public T[] getArrayValues() {
        return array;
    }
}
