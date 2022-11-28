/**
 * Import static, negative impact
 * 
 * Dumping potentialy large classes into your namespace, 
 * might have a negative impact on readabilty and testability
*/

package com.minte9.effective.import_static;
import static java.lang.Math.*; // Look Here

public class Impact {
    public static void main(String[] args) {

        System.out.println(PI); // 3.141592653589793
        System.out.println(E);  // 2.718281828459045
    }
}