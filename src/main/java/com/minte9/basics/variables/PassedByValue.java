/**
 * Variables in Java are passed by copy, 
 * not by reference
 * 
 * x bits are copied / this copy goes in z
 * z changes / x not changed
 */

package com.minte9.basics.variables;
public class PassedByValue {
    public static void main(String[] args) {
        new MyClass();
    }
}

class MyClass {
    int x;

    public MyClass() {
        x = 7; // 00000111
        go(x); // x bits are copied
    }

    public void go(int z) {
        System.out.println(x == z); // true
        
        z = 0; // x doesn't change
        System.out.println(x == z); // false
    }
}
