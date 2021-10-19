/**
 * In Java variables are passed by value ...
 * not by reference.
 * 
 * For global variables use static keyword.
 */

package com.minte9.basics.variables;

public class PassedByValue {

    public static void main(String[] args) {
        
        MyClass obj = new MyClass();

        int x = 3;
        obj.init(x); // passed by value
        System.out.println(x); // 3 (not 0)  
        
        String y = "aaa";
        MyClass.set(y);
        System.out.println(MyClass.y); // zzz (not aaa)
    }
}

class MyClass {

    int x;
    public void init(int x) {
        x = 0;
    }
    
    static String y;
    public static void set(String y) {
        MyClass.y = "zzz";
    }
}
