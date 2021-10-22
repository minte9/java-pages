/**
 * The code inside finally block is exectuted ...
 * if there is an exception or not.
 */

package com.minte9.basics.exceptions;

public class Finally {
    public static void main(String[] args) {

        try {
            myMethod("myValue");
        } catch (Exception e) {
            System.out.println("Exception");
        } finally {
            System.out.println("Executed always!");
        }

        /*
            myValue
            Executed always!
        */
    }
    
    static void myMethod(String s) throws Exception {
        
        if (s.equals("wrongValue")) {
            throw new Exception();
        }

        System.out.println(s);
    }
}
