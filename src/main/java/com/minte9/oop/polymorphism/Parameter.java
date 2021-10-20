package com.minte9.oop.polymorphism;

public class Parameter {
    public static void main(String[] args) {

        File file = new File();
        Csv csv = new Csv();
        Xml xml = new Xml();

        file.open(csv); // CSV open
        file.open(xml); // XML open
    }
}

class Item {
    protected String type;
    public void open() {
        System.out.println(type + " open"); 
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
    public void open(Item item) {
        item.open();
    }
}