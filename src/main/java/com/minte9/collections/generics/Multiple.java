/**
 * A generic type may have multiple type parameters.
 * Each parameter must be unique.
 */

package com.minte9.collections.generics;

public class Multiple {
    public static void main(String[] args) {
        
        Box<Integer, Integer> box = new Box<>();
        box.set(10);
        System.out.println(box.get()); // 10
    }

    static class Box<T, U> {

        private T t;
        public void set(T t) { 
            this.t = t; 
        }
        public T get() { 
            return t; 
        }
    }

    // static class Word<T, T> {} // Error: Duplicate type parameter T
}