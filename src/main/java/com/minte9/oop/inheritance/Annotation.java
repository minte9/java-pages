/**
 * Abstract method with no Override annotation ...
 * will throw error only at compile time.
 */

package com.minte9.oop.inheritance;

public class Annotation {
    public static void main(String[] args) {
        new MyClass();
    }
}

abstract class MyAbstractClass {
    abstract public void setName();
}

class MyClass extends MyAbstractClass {

    // Wrong method name - with no Override annotation)
    public void setNames() {}

    // Correct - with Override annotation
    @Override 
    public void setName() {}
}
