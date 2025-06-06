/**
 * Polymorphism and Dependency Injection
 * 
 * Using polymorphism we can pass object as parameters ...
 * and call object's super methods. 
 */

package com.minte9.oop.polymorphism;

public class Parameter {
    public static void main(String[] args) {

        File file = new File();
        Csv csv = new Csv();
        Xml xml = new Xml();

        file.open(csv); // CSV opened
        file.open(xml); // XML opened
    }
}

class Item {
    protected String type;
    public void open() {
        System.out.println(type + " opened"); // PO
    }
}

class Csv extends Item {
    public Csv() {
        type = "CSV";
    }
}

class Xml extends Item {
    public Xml() {
        type = "XML";
    }
}

class File {
    public void open(Item item) { // DI
        item.open();
    }
}