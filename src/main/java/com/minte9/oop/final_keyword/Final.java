/**
 * A final class can't be exended and ...
 * A final method can't be overriden.
 */

package com.minte9.oop.final_keyword;

public class Final {
    public static void main(String[] args) {
        new Dog();
    }
}
class Animal {    
    public final void getName() { // Look Here

    }
}

class Dog extends Animal {
    /*
        public void getName() {} // Error: override final method
    */
}
