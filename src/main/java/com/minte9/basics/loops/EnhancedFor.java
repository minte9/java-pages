/**
 * With Enhanced For Loop you don't need a loop index 
 */
package com.minte9.basics.loops;

public class EnhancedFor {            
    public static void main(String[] args) {
        
        int[] numbers = {1, 2, 3, 4, 5};

        for (int no : numbers) {
            System.out.println(no); // 1 2 .. 5
        }
    }
}
