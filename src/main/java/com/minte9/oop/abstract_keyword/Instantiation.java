/**
 * By marking the class abstract, you can prevent instantiation.
 * 
 * What exactly is an Animal object, what color, what size?
 * We don't know, so the class must be defined as abstract.
 */

package com.minte9.oop.abstract_keyword;

public class Instantiation {
    public static void main(String[] args) {
        
        new Dog("gray");

        //new Animal(); // force compile error - what color?
    }
}

abstract class Animal {
    protected String color;
    public Animal(String c) {
        color = c;
    }
}

class Dog extends Animal {
    public Dog(String c) {
        super(c);
    }
}
