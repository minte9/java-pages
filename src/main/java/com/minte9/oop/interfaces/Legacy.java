/**
 * When you add methods to an interface, current related classes will break.
 * You'll need to create more interfaces that extend initial interface.
 * 
 * Where is possible, it is better to createa a new interface.
 */

package com.minte9.oop.interfaces;

public class Legacy {
    public static void main(String[] args) {
        new OldClass();
        new NewClass();
    }
}

class OldClass implements A {
    @Override public void setvalue() {}
}

class NewClass implements B {
    @Override public void setvalue() {}
    @Override public void settype() {}
}

interface B extends A {
    public void settype();
}

interface A {
    public void setvalue();
}