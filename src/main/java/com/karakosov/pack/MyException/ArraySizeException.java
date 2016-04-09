package com.karakosov.pack.MyException;

/**
 * Created  on 26.03.16. by Stas Karakosov
 * MyException class
 */
public class ArraySizeException extends Exception {
    /**
     *Constructor
     * @param e incoming param
     */
    public ArraySizeException(final Throwable e) {
        initCause(e);
    }
}
