/**
 * Default keyword allows you to add implementation in interfaces.
 * Other methods (non default) must be all define as abstract.
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
    default void settype() { // Look Here
        System.out.println("New interface method - settype");
    };
}