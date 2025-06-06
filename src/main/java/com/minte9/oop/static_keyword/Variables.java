/**
 * Static variables
 * 
 * Initialized only once
 * Common to all objects created with that class
 * Can be called without object instantiation
 */

package com.minte9.oop.static_keyword;
public class Variables {
    public static void main(String[] args) {

        X a = new X();
        X b = new X();
        
        System.out.println(
            b.getCount() // 2
        );
        System.out.println(
            a.getCount() // 2, not 1
        );
        System.out.println(
            X.count // 2
        );
    }
}

class X {
    public static int count; // Look Here

    public X() {
        count++;
    }

    public int getCount() {
        return count;
    }
}