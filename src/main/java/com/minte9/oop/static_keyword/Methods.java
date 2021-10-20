/**
 * Static methods belong to the class and not every instance of the class.
 * Example: Java.lang.Math has a round() static method.
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

        // Math m = new Math(); // Error: private access
    }

    private static long myRound(Double n) {
        return Math.round(n);
    }
}