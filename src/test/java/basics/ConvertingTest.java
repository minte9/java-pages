package basics;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class ConvertingTest {
    
    @Test public void toNumberTest() {

        String a1 = "1";
        String a2 = "1.11";
        Integer b1 = Integer.valueOf(a1);
        Float b2 = Float.valueOf(a2);
        assertEquals(2.1100, b1+b2, 4);         // pass
        assertNotEquals("2.1100", b1+b2, 4);    // pass
    }

    @Test public void toStringTest() {

        int i = 11;
        assertEquals("11", "" + i);                     // pass
        assertEquals("11", "" + String.valueOf(i));     // pass
        assertEquals("11", "" + Integer.toString(i));   // pass
    }
}
