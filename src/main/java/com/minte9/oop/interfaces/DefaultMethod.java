/**
 * Default keyword allows you to add implementation in interfaces.
 * Non default methods must be all define as abstract.
 */

package com.minte9.oop.interfaces;

public class DefaultMethod {
    public static void main(String[] args) {

        new AC().output(); // A - output
        new BC().output(); // B - output

        new AC().output_new(); // C - default output_new
        new BC().output_new(); // C - default output_new
    }
}

class AC implements C {

    @Override public void output() {
        System.out.println("A - output");
    }
}

class BC implements C {

    @Override public void output() {
        System.out.println("B - output");
    }
}

interface C {

    void output();

    default void output_new() { // Look Here
        System.out.println("C - default output_new");
    };
}