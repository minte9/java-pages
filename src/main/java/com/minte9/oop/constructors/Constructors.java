/**
 * Constructor use the class name and has no return type.
 * You could have more than one constructor in a class.
 */

package com.minte9.oop.constructors;

public class Constructors {
    public static void main(String[] args) {

        new A().test();
        new B("aaa");
        new B(100);

        /*
            Default constructor used
            Constructor 1 - aaa
            Constructor 2 - 100
        */
    }
}

class A {
    
    /*
        public Output() {
            // default constructor
        }
    */

    public void test() {
        System.out.println("Default constructor used");
    }
}

class B {
    
    public B(String s) {
        System.out.println("Constructor 1 - " + s);
    }
    
    public B(int i) {
        System.out.println("Constructor 2 - " + i);
    }
}