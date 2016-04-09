package com.karakosov.pack.InterfaceReverse;

/**
 * Created  on 26.03.16. by Stas Karakosov
 * Interface for provide contract with specific business object.
 */
public interface IReverseArray  {

    /**
     * reverse_Array() is reverse of <T> type array.
     * @param array is array <T> type
     * @param <T> type
     * @return reversed array
     */
     <T> T[] reverseArray(T[] array);
}
