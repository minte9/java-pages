/**
 * A static final variables is a constant.
 * It cannot be changed.
 */

package com.minte9.oop.final_keyword;

public class Constants {
    public static void main(String[] args) {
        new MyClass(); // 25
    }
}

class MyClass {
    public static final int FOO = 25; // Look Here

    public MyClass() {
        System.out.println(FOO);

        // FOO++; // Compile Error - Look Here
    }
}
