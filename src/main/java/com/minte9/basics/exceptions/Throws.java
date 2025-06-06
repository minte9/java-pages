/**
 * Throws Exception
 * 
 * Using throws Exception forces the developer ...
 * to wrap the code with try/catch
 * She will know that you are using a risky method
 */

package com.minte9.basics.exceptions;

public class Throws {
    public static void main(String[] args) {

        try {
            A.check("correct"); 
            A.check("wrong"); // OK for compiler
        } catch (Exception e) {
            System.out.print(
                "Exception: " + e.getMessage() // Exception: Wrong value!
            );
        }
    }
    
    
}

class A {
    static boolean check(String s) throws Exception { // Look Here
        
        if (s.equals("wrong")) {
            throw new Exception("Wrong value!");
        }
        return true;
    }
}