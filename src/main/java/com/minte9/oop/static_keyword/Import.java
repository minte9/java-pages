/**
 * Static import improves code readability but might lead to confusion, ...
 * use it with care.
 * 
 * Effective Java: "Use static imports ...
 * if you find yourself heavily using constants from a utility class"
 */

package com.minte9.oop.static_keyword;

import static java.lang.Math.round; // Look Here

public class Import {
    public static void main(String[] args) {

        System.out.println(
            round(42.2)
            // Math.round(42.2));
        );
    }
}
