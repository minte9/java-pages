/**
 * Variables in Java are passed by copy, not by reference
 * 
 * In this example, first variable x = 7 bits are copied (00000111).
 * Second this copy goes in z variable.
 * Third, after variable z changes, we can see that x is not changed.
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
        x = 7;      // 00000111
        change(x);  // x bits are copied in z
    }

    public void change(int z) {
        System.out.println("x == z " + (x == z));

        z = 0;
        System.out.println("z changed / x doesn't change");
        System.out.println("x != z " + (x != z));
    }
}

/*
    x == z true
    z changed / x doesn't change
    x != z true
*/