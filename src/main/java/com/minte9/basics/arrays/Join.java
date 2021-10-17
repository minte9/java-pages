/**
 * Array string elements can be joined with ...
 * String.join() method (since JDK 1.8)
 */

package com.minte9.basics.arrays; //

public class Join {
    public static void main(String[] args) {
        
        String[] letters = new String[] {"a", "b", "c"};
        System.out.println(

            String.join(", ", letters) // a, b, c
        );  
    }
}
