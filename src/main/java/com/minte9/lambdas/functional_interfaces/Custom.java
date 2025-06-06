/**
 * You can create custom functional interface.
 */

package com.minte9.lambdas.functional_interfaces;

public class Custom {
    public static void main(String[] args) {

        MyFuncInterface s1 = s -> s + "!";
        MyFuncInterface s2 = s -> s + "?";

        System.out.println(s1.run("Hello")); 
            // Hello!
        System.out.println(s2.run("Hello")); 
            // Hello?
    }
}

abstract interface MyFuncInterface {
    String run(String s);
}