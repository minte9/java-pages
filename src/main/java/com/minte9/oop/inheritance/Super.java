/**
 * super() method is used to call parent constructor
 * super() method must be the first statement in each controller
 */

package com.minte9.oop.inheritance;

public class Super {
    public static void main(String[] args) {
        new A();
    }
}

class A extends ParentClass {
    public A() {
        super(); // Parent constructor
    }

    /*
    public void A(String s) {
        super(s);
        
        // Error: Call to super must be the first statement
        // void is the first statement
    }
    */
}

class ParentClass {
    public ParentClass() {
        System.out.println("Parent constructor");
    }
}
