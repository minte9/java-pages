/**
 * A final class can't be exended and ...
 * a final method can't be overriden.
 */

package com.minte9.oop.final_keyword;

public class Final {
    public static void main(String[] args) {
        new Dog();
    }
}
class Animal {    
    public Animal() {}
    public final void getName() {} // Look Here
}

class Dog extends Animal {
    public Dog() {}
    //public void getName() {} // Error: override final method
}
