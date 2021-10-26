/**
 * It is very common to use a lambdas that call methods on its parameter.
 * There is an abbreviated syntax for this, called ...
 * method reference.
 * 
 * The standard form of method reference is ...
 * Classname::methodName
 * 
 * The code is not only more shorter ...
 * but also a lot easier to read.
 */
package com.minte9.lambdas.static_methods;

import java.util.Arrays;
import java.util.List;

public class MethodReference {
  public static void main(String[] args) {
      
    List<String> myList = Arrays.asList("a", "b", "c");

    myList.stream()
      .map(x -> x + x)
      .map(String::toUpperCase)
      .forEach(System.out::println); 
        // AA BB CC
  }
}