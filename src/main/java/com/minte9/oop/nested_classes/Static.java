/**
 * Only nested classes can be declared as static classes.
 * Inner classes can use fields from outer class.
 */

package com.minte9.oop.nested_classes;

public class Static {
    public static void main(String[] args) {
        
        A.B.run(); // 10
    }

    static class A {

        static int a = 10;
        static class B {
            
            public static void run() {
                System.out.println(a); // field from Outer Class
            }
        }
    }
}
