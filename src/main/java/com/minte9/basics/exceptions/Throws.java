/**
 * Using "throws Exception" forces the developer ...
 * to wrap the code with try/catch.
 * 
 * It will know that you are using a risky method.
 */

package com.minte9.basics.exceptions;

public class Throws {
    public static void main(String[] args) {

        try {
            myMethod("wrongValue"); // the compiler is OK
        } catch (Exception e) {
            System.out.print("Exception found!"); // Exception found!
        }
    }
    
    static void myMethod(String s) throws Exception {
        
        if (s.equals("wrongValue")) {
            throw new Exception();
        }
    }
}
