/**
 * Variables in Java are passed by value (a copy), 
 * not by reference
 */

package com.minte9.basics.variables;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

class A {
    int x;

    public void init(int z) {
        z = 0;
    }
}

public class PassedByValueTest {

    @Test public void objTest() {

        A a = new A();
        //x = 3;
        a.init(3);
        int x = 1000;
        assertEquals(x, 1000);     // pass
        assertTrue(x != 0);     // pass
    }
}