/**
 * CUSTOM FUNCTIONAL INTERFACE
 * ---------------------------
 * You can define your own functional interface when:
 *   - built-in ones (Predicate, Function, etc) don't fit
 *   - you want clearer domain-specific meaning
 * 
 * A functional interface must have exactly ONE abstract method.
 * 
 * A method reference works when the referenced method
 * has the SAME signature as the functional interface method.
 */

package com.minte9.lambdas.functional_interfaces;

public class CustomFunctionalInterface {
    public static void main(String[] args) {

        MyFuncInterface exclaim = s -> s + "!";
        MyFuncInterface question = s -> s + "?";

        System.out.println(exclaim.run("Hello World"));  // Hello World!
        System.out.println(question.run("Java Lambdas"));  // Java Lambdas?

    }
}

// Custom functional interface
@FunctionalInterface
abstract interface MyFuncInterface {
    String run(String s);
}