/**
 * Static method
 * 
 * Belongs to the class and not every instance of the class
 * Java.lang.Math has a round() private static method
 *      Math m = new Math(); // Error: private access
 */

package com.minte9.oop.static_keyword;
public class Methods {
    public static void main(String[] args) {

        System.out.println(
            Math.round(42.2) // 42
        );

        System.out.println(
            Methods.myRound(33.5) // 34
        );
    }

    private static long myRound(Double n) {
        return Math.round(n);
    }
}