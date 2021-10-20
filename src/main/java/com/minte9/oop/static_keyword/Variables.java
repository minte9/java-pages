/**
 * Static variables are initialized only once.
 * 
 * A static class variable is common to all objects created with that class. 
 * It can be called without object instantiation.
 */

package com.minte9.oop.static_keyword;

public class Variables {
    public static void main(String[] args) {

        A a1 = new A();
        A a2 = new A();
        
        System.out.println(a1.getCount()); // 2
        System.out.println(a2.getCount()); // 2

        System.out.println(A.id); // 100
    }
}

class A {

    private static int count = 0;
    public static int id = 100;

    public A() {
        count++;
    }
    public int getCount() {
        return count;
    }
}
