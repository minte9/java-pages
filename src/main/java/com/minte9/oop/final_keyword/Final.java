/**
 * A final class can't be exended.
 * A final method can't be overriden.
 */

package com.minte9.oop.final_keyword;

public class Final {
    public static void main(String[] args) {
        new B();
    }
}
class A {    
    public final void getName() { // Look Here

    }
}

final class B extends A {
    /*
        public void getName() {
            // Error: override final method
        } 
    */
}

/*
    class C extends B { 
        // C cannot subtype finalclass B
    }
*/