/**
 * In Java the object can be different types (polymorphism).
 * 
 * To access a subtype method from a super type object ...
 * you must cast the object with subtype. 
 */

package com.minte9.oop.polymorphism;

public class Casting {
    public static void main(String[] args) {

        Animal a1 = new Dog(); // reference is an Animal
        Animal a2 = new Cat(); // object is a Cat

        System.out.println(a1.roaming()); 
        System.out.println(a2.eating());
        System.out.println((
            (Dog) a1).barking() // Look Here
        ); 

        // myDog is roaming (super method)
        // myCat is eating (super method)
        // myDog is barking (Dog method)
    }
}

class Animal {
    protected String name;
    public String eating() { 
        return name + " is eating (super method)"; 
    }
    public String roaming() { 
        return name + " is roaming (super method)"; 
    }
}

class Dog extends Animal {
    public Dog() { 
        name = "myDog"; 
    }
    public String barking() { 
        return name + " is barking (Dog method)"; 
    }
}

class Cat extends Animal {
    public Cat() { 
        name = "myCat"; 
    }
}
