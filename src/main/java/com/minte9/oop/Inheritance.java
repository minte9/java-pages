/**
 * Inheritance means that a subclass extends a super class.
 * Superclasses defines what subclasses have in common ...
 * then abstract those features.
 */

package com.minte9.oop;

public class Inheritance {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setAction("barking");
        dog.action(); // The Dog is barking

        Bird bird = new Bird();
        bird.setAction("flying");
        bird.action(); // The Bird is flying
    }
}

abstract class Animal {

    public String action;
    public void setAction(String a) { 
        action = a; 
    }
    public abstract void action();
}

class Dog extends Animal {
    @Override public void action() {
        System.out.println(
            "The Dog is " + action
        );
    }
}

class Bird extends Animal {
    @Override public void action() {
        System.out.println(
            "The Bird is " + action
        );
    }
}
