/**
 * All of the numberic wrapper classes are subclasses of ...
 * the abstract class Number.
 * 
 * Effective Java (Item 49): 
 * Prefer primitive types to boxed primitives. 
 */

package com.minte9.basics.numbers;

public class Numbers {
    public static void main(String[] args) {

        Number no = Double.valueOf(22.33);

        System.out.println(no.shortValue()); // 22
    }
}