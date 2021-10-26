/**
 * It's always better to put related methods in the same place.
 * Static methods are allowed in interfaces (Java 8).
 */

package com.minte9.lambdas.static_methods;

import java.util.function.BinaryOperator;
import java.util.stream.Stream;
import static org.junit.Assert.assertEquals;

public class StaticMethod {
  public static void main(String[] args) {
      
    int sum = MyStream.of(1, 2, 3)
      .reduce(0, (acc, x) -> acc + x)
    ;
    assertEquals(6, sum); // pass
  }
}

abstract interface MyStream<T> extends Stream<T> {
  
    @SafeVarargs 
    @SuppressWarnings("varargs")

    static <T> Stream<T> of(T... values) { // Look Here
        return Stream.of(values);
    }

    abstract T reduce(T arg0, BinaryOperator<T> arg1);
}