package com.minte9.basics.strings;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;

public class ConvertingTest {
    
    @Test public void toNumberTest() {

        String  a = "1";
        String  b = "2.22";
        Integer c = Integer.valueOf(a); // 1
        Float   d = Float.valueOf(b);   // 2.22
        
        assertEquals(c, 1, 0);
        assertEquals(d, 2.23, 0.1);

        assertNotEquals(c, "1");
        assertNotEquals(d, 2.23, 0);
    }

    @Test public void toStringTest() {

        int i = 11;
        assertEquals("11", "" + i);
        assertEquals("11", "" + String.valueOf(i));
        assertEquals("11", "" + Integer.toString(i));
    }
}