/**
 * When you add methods to an interface, current related classes will break.
 * You'll need to create more interfaces that extend initial interface.
 * 
 * Where is possible, it is better to createa a new interface.
 */

package com.minte9.oop.interfaces;

public class Legacy {
    public static void main(String[] args) {
        
        new ClassA().setvalue();
        new ClassA().settype();
        new ClassB().settype();

        /*
            Old class - setvalue
            New interface method - settype
            New interface method - settype
        */
    }
}

class OldClass implements A {
    @Override public void setvalue() {
        System.out.println("Old class - setvalue");
    }
}

class NewClass implements B {
    @Override public void setvalue() {
        System.out.println("NewClass - setvalue");
    }
    @Override public void settype() {
        System.out.println("NewClass - settype");
    }
}

interface B extends A {
    public void settype();
}

interface A {
    public void setvalue();
}