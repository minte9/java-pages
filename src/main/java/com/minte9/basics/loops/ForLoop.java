/**
 * For loop can be used when you know ...
 * how many times you want to loop.
 * 
 * Those three expressions in the for loop are optional ...
 * but this form is not recommended.
 */
package com.minte9.basics.loops;

public class ForLoop {            
    public static void main(String[] args) {
        
        for (int i=0; i<10; i++) {
            System.out.println(i); 
                // 0 1 2 .. 9
        }

        int i=0; for ( ;; ) { // infinite loop
            if (i >= 10) break;
            System.out.println(i++); 
                // 0 1 2 .. 9
        }
    }
}
