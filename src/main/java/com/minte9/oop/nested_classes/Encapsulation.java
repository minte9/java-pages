/**
 * Nested classes increases encapsulation.
 * They can lead to more readable and maintainable code.
 */

package com.minte9.oop.nested_classes;

public class Encapsulation {
    public static void main(String[] args) {
        
        System.out.println(
            OuterClass.InnerClass.y // 20
        );
    }
}

class OuterClass {

    int x = 10;
    static class InnerClass {
        
        static int y = 20;
    }
}
