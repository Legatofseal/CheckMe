package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Legat on 21.04.2016.
 */
public class ArrayCollectionTestTest {

    @Test
    public void testAddElement() throws Exception {
        Double doubleTest = Math.random();
        Double doubleTest1 = Math.random();
        ArrayCollectionTest test = new ArrayCollectionTest(100);
        test.addElement(doubleTest);
        test.addElement(doubleTest1);
    assertEquals("Wrong Element", test.getInternalArray()[0], doubleTest1);
    }

}