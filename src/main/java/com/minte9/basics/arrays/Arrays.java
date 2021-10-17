/**
 * One way to create an array si with new operator ...
 * which allocates the memory for 3 elements.
 * 
 * You can also create and initialize the array with {} syntax
 * Here the length of the array is the number of ...
 * elements between braches.
 */

package com.minte9.basics.arrays;

public class Arrays {
    public static void main(String[] args) {
        
        /**
         * create an array of integers and ..,
         * initialize the array with 3 integers
         */
        int[] nums; 
        nums = new int[3]; 
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        System.out.println(nums[2]); // 3

        /**
         * create and intialize an array with 3 strings
         */
        String[] names = {"John", "Marry", "Ana"};
        System.out.println(names[2]); // Ana

        /**
         * tring to assign a new value raises an ...
         * out of bonds error
         */
        names[3] = "Willy";
    }
}
