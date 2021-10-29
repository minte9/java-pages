package com.minte9.basics.variables;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class PassedByValueTest {

    @Test public void objectTest() {

        A obj = new A();
        int x = 3;
        obj.init(x);
        assertEquals(x, 3);     // pass
        assertTrue(x != 0);     // pass
    }

    @Test public void staticTest() {

        String y = "aaa";
        A.set(y);
        assertEquals(A.y, "zzz");         // pass
        assertTrue(! A.y.equals("aaa"));  // pass
    }
}

class A {

    int x;
    public void init(int x) {
        x = 0;
    }
    
    static String y;
    public static void set(String y) {
        A.y = "zzz";
    }
}