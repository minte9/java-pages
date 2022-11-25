/**
 * Loops
 * 
 * For Loop, when you know how many loops
 * Enhanced For Loop, index not needed
 * ForEach, loop over a Collection
 */
package com.minte9.basics.loops;
import java.util.Arrays;
import java.util.List;

public class ForLoop {            
    public static void main(String[] args) {
        
        // for loop
        for (int i=0; i<3; i++) {
            System.out.println(i); // 0 1 2
        }

        // enhanced
        int[] nums = {10, 20, 30};
        for (int no : nums) {
            System.out.println(no); // 10 20 30
        }

        // foreach
        List<Integer> data = Arrays.asList(100, 200, 300);
        data.forEach(x -> System.out.println(x));  // lambda
        data.forEach(System.out::println); // method reference
            // 100 200 300
            // 100 200 300
    }
}