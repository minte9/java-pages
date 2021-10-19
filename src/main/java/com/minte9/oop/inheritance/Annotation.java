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
    abstract public void setAction();
}

class MyClass extends MyAbstractClass {

    public void setNames() {} // wrong method & no Override

    @Override 
    public void setAction() {}
}
