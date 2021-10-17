/**
 * There are 3 reference variables and 2 objects
 * 
 * After a overrites b ...
 * the b reference to object 2 is destroyed
 * (eligible for Garbage Collection)
 */

package com.minte9.basics.objects;

public class References {
    
    public static void main(String[] args) {
        
        Book a = new Book("A");
        Book b = new Book("B");
        System.out.printf("%s %s \n", a, b); // A B

        Book c = b; // refc / objB
        System.out.printf("%s %s %s \n", a, b, c); // A B B

        b = a; // refb / objA
        System.out.printf("%s %s %s \n", a, b, c); // A A B
    }
}

class Book {
    String name;   

    public Book(String name) { // contructor
        this.name = name;
    }
    public String toString() {
        return name;
    }
}