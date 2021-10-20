/**
 * Using polymorphism we can pass object as parameters ...
 * and call object's super methods  
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

abstract class Item {
    abstract public void open();
}

class Csv extends Item {
    public void open() {
        System.out.println("Csv opened"); 
    }
}

class Xml extends Item {
    public void open() {
        System.out.println("Xml opened"); 
    }
}

class File {
    public void open(Item item) {
        item.open();
    }
}