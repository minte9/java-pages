/**
 * Import static, to avoid qualifying with the class name 
 * 
 * Dumping potentialy large classes into your namespace, 
 * might have a negative impact on readabilty and testability.
 * Use it with care!
 *  
 * "Use static imports if you find yourself 
 * heavily using constants from a utility class" (Effective Java)
 */

package com.minte9.effective.import_static;
import static org.junit.Assert.assertEquals;
import static java.lang.Math.PI; // Look Here 
import static java.lang.Math.*; // Look Here

public class Math_Utility {
    public static void main(String[] args) {

        assertEquals(PI == Math.PI, true);
        assertEquals(Math.round(42.2) == round(42.2), true);
        assertEquals(java.lang.Math.E == 2.718281828459045, true);

        System.out.println("Tests passed");
    }
}