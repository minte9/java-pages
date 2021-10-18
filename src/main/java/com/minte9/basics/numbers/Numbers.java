/**
 * Java provides wrapper classes for each primitive data types.
 * 
 * All of the numberic wrapper classes are subclasses of ...
 * the abstract class Number
 */

package com.minte9.basics.numbers;

public class Numbers {
    public static void main(String[] args) {

        Number no = Double.valueOf(22.33);

        System.out.println(no.shortValue()); // 22
    }
}