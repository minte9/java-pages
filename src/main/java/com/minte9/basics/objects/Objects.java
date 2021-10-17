/**
 * To use an object you must declare a reference variable.
 * JVM allocates space for the object.
 * 
 * The reference variable is forever of type Dog!
 * myDog = new Cat(); // will throw a type mismatch error
 */

package com.minte9.basics.objects;

public class Objects {
    public static void main(String[] args) {
    
        Dog myDog = new Dog();
        myDog.size = 40;
        myDog.bark();
    }
}

class Dog {
    int size;
    String name;
    
    void bark() {
        System.out.println("Ham Ham"); // Ham Ham
    }
}

class Cat {}
