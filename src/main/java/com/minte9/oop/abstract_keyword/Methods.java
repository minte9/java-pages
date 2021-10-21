/**
 * An abstract class means ...
 * the class must be extended.
 * 
 * An abstract method means ...
 * the method must be overridden.
 */

package com.minte9.oop.abstract_keyword;

public class Methods {
    public static void main(String[] args) {
        new D();
    }
}
abstract class A {
    public abstract void setValue(); // abstract
    public void setName() { // non-abstract

    } 
}

class D extends A {
    @Override public void setValue() {}
}
