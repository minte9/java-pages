/**
 * When you add methods to an interface, current related classes will break.
 * You'll need to create more interfaces that extend initial interface.
 * 
 * Where is possible, it is better to createa a new interface.
 */

package com.minte9.oop.interfaces;

public class Default {
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

class ClassA implements C {
    @Override public void setvalue() {
        System.out.println("Old class - setvalue");
    }
}

class ClassB implements C {
    @Override public void setvalue() {
        System.out.println("New class - setvalue");
    }
}

interface C {
    void setvalue();
    default void settype() {
        System.out.println("New interface method - settype");
    };
}