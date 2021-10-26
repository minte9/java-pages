/**
 * When you add methods to an interface, current related classes will break.
 * You'll need to create more interfaces that extend initial interface.
 * 
 * Where is possible, it is better to createa a new interface.
 */

package com.minte9.oop.interfaces;

public class Legacy {
    public static void main(String[] args) {

        new LA().setvalue(); // LA - setvalue
        
        new LB().settype(); // LB - settype
    }
}

class LA implements A {
    @Override public void setvalue() {
        System.out.println("LA - setvalue");
    }
}

class LB implements B {
    @Override public void setvalue() {
        System.out.println("LB - setvalue");
    }
    @Override public void settype() {
        System.out.println("LB - settype");
    }
}

interface B extends A { // Look Here
    public void settype();
}

interface A {
    public void setvalue();
}