/**
 * Interfaces are subject to multiple inheritance.
 * Java compiler might not know which method to choose.
 */

package com.minte9.lambdas.default_methods;

public class Super {
    public static void main(String[] args) {
  
        String msg = new myClass().hello();
        System.out.println(msg); // Hello A
    }
  }
  
  interface A {
    public default String hello() { return "Hello A"; }
  }
  
  interface B {
    public default String hello() { return "Hello B"; }
  }
  
  class myClass implements A, B {
    /**
    * Use enhanced super syntax ...
    */
    @Override public String hello() { // Look Here
        return A.super.hello();
    }
  }
  