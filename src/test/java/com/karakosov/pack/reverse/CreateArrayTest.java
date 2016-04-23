package com.karakosov.pack.reverse;


import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created  on 26.03.16. by Stas Karakosov
 */
public class CreateArrayTest {

    private CreateArray createdArray = new CreateArray();

    @Test
    public void createArray() throws Exception {
        createdArray.createArray(10);

        assertEquals(10, createdArray.createArray(10).length);
    }
}