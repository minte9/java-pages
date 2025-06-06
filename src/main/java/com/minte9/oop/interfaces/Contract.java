/**
 * An interface is forcing the developer to implement methods ...
 * it is like a contract.
 * 
 * In an interface everything must be an abstract method.
 */

package com.minte9.oop.interfaces;

public class Contract {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.play(); 
            // Dog is playing
    }
}

class Dog implements Canine { // Look Here
    
    @Override 
    public void play() {
        System.out.println("Dog is playing");
    }
    
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }
}

interface Canine { 
        // no class keyword

    public abstract void play();
    public void eat(); 
        // abstract by default

    // public void move() {}; 
        // Error: Interface methods cannot have body
}

interface Feline {
    public abstract void play();
}