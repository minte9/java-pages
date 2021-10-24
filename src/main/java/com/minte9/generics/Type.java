/**
 * A generic type is a special kind of variable ...
 * with whatever type you pass in.
 */

package com.minte9.generics;

public class Type {

    public static void main(String[] args) {
        
        A a = new A();
        a.set(10);
        System.out.println(a.get()); // 10
        a.set("John");
        System.out.println(a.get()); // John

        Box<Integer> b = new Box<>();
        b.set(10);
        System.out.println(b.get()); // 10
        // b.set("John"); // Error: not applicable ...
    }
}

class A { // non generic class

    private Object obj;
    public void set(Object o) { 
        obj = o;
    }
    public Object get() { 
        return obj; 
    }
}

class Box<T> { // generic class (type)
        
    private T t;
    public void set(T t) { 
        this.t = t; 
    }
    public T get() { 
        return t; 
    }
}