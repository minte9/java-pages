/**
 * Import static
 * 
 * You can use import static to avoid ...
 * qualifying with the class name. 
 */

package com.minte9.effective.import_static;

import static java.lang.Math.PI; // Look Here 
// import static java.lang.Math.E;

public class Utility {

    public static void main(String[] args) {

        System.out.println(PI); // Look Here
            // 3.141592653589793
        
        System.out.println(java.lang.Math.E); 
            // 2.718281828459045
    }
}