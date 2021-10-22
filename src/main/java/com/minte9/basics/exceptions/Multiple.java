/**
 * A method can throw multiple exceptions.
 */

package com.minte9.basics.exceptions;

public class Multiple {
    public static void main(String[] args) {

        try {

            test(-10);      
                // Exception: Positive number required!

            System.out.println(args[2]);
                // Exception: Index 2 out of bounds ... 

        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
        
    public static void test(int n) 
        throws Exception, ArrayIndexOutOfBoundsException {
        
        if (n < 0) {
            throw new Exception("Exception: Positive number required");
        }
    }
}
