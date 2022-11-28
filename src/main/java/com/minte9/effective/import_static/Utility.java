/**
 * Import static
 * 
 * To avoid qualifying with the class name 
 * Dumping potentialy large classes into your namespace, 
 * might have a negative impact on readabilty and testability
 */

package com.minte9.effective.import_static;
import static java.lang.Math.PI; // Look Here 
import static java.lang.Math.*;

public class Utility {
    public static void main(String[] args) {

        System.out.println(
            PI // Math.PI =3.141592653589793
        );
        
        System.out.println(
            java.lang.Math.E // 2.718281828459045
        );

        System.out.println(
            round(42.2) // Math.round(42.2)) = 42
        );
    }
}