/**
 * Examples of functional interfaces, using Predicate interface.
 */

package com.minte9.lambdas.functional_interfaces;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateExamples {
    public static void main(String[] args) {

        Predicate<Integer> op1 = (x) -> (x % 2 == 0);
        System.out.println(op1.test(36)); 
            // true

        Predicate<String> op2 = new Predicate<>() {
            @Override public boolean test(String t) {
                return t.length() > 3;
            }
        };
        System.out.println(op2.test("abcd")); 
            // true

        Predicate<String> op3 = t -> (t.length() > 3);
        System.out.println(op3.test("abcd")); 
            // true

        Function<Long, Long> op = x -> x + 1;
        System.out.println(op.apply(20L)); 
            // 21
    }
}

/*
package java.util.function;
public abstract interface Predicate<T> {
  
  public abstract  boolean test(T arg0);

  ...
*/