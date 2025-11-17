/**
 * To force an exception use 'throws Exception' in method definition.
 * The developer will know that you are using a risky method.
 * The developer is forced to wrap the code with try/catch.
 */

package com.minte9.basics.exceptions;

public class Throws {
    public static void main(String[] args) {

        try {
            A.check("wrong"); // the line is ok for compiler
        } catch (Exception e) {
            System.out.print(e.getMessage());  // Wrong value exception!
        }
    }
    
    
}

class A {
    static boolean check(String s) throws Exception { // Look Here
        
        if (s.equals("wrong")) {
            throw new Exception("Wrong value exception!");
        }
        return true;
    }
}