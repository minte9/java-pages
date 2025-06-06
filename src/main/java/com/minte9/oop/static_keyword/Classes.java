/**
 * Static classes
 * 
 * Only nested classes can be static
 * You can use the nested class without an instance for outer class
 */

package com.minte9.oop.static_keyword;
public class Classes {

    static int a = 10;
    public static void main(String[] args) {
        InnerClass.run(); // 10
    }
    
    static class InnerClass {
        public static void run() {
            System.out.println(a); // field from Outer Class
        }
    }
}