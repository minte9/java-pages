/**
 * JUnit 3 style:
 * 
 * The test class that extends TestCase.
 * The methods must start with the word test.
 */

package com.minte9.junit.about;
import junit.framework.TestCase;

public class Junit3Test extends TestCase {

    public void testSum() {

        int a = 5;
        int b = 10;

        assertEquals(15, a+b);
    }
}