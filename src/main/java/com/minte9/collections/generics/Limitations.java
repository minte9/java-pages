/**
 * Generic type params can't be static.
 *
 * Because static field is shared by all objects ...
 * what's the actual type of t?
 * 
 * Generics cannot be used with primitives.
 */

package com.minte9.collections.generics;

public class Limitations {
    public static void main(String[] args) {
        
        Box<Integer> b1 = new Box<>();
        Box<String> b2 = new Box<>();

        System.out.println(b1.hashCode());
        System.out.println(b2.hashCode());
        
        // Box<int> box = new Box<int>(); // not allowed!
    }

    static class Box<T> {

        //static T t; // Error: static reference to non-static T
    }
}