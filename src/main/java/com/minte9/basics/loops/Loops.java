/** 
 * The 'for' is used when you know how many loops.
 * The enhanced 'for' is used whne index is not needed.
 * The 'forEach' loops over a Collection, it is ofthen used with
 * lambdas or  method reference
 */

package com.minte9.basics.loops;
import java.util.Arrays;
import java.util.List;

public class Loops {            
    public static void main(String[] args) {
        
        System.out.println("\nFor loop:");

        for (int i=0; i<3; i++) {
            System.out.print(i);  // 012
        }

        System.out.println("\nEnhanced for:");

        int[] nums = {0, 1, 2};
        for (int no : nums) {
            System.out.print(no);  // 012
        }

        System.out.println("\nforEach with lambdas:");

        List<Integer> A = Arrays.asList(0, 1, 2);
        A.forEach(x -> System.out.print(x));  // 012

        System.out.println("\nforEach with method reference:");

        List<Integer> B = Arrays.asList(0, 1, 2);
        B.forEach(System.out::print);  // 012
    }
}