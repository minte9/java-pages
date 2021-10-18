/**
 * Starting with Java 8 we can use forEach ...
 * to loop over a Collection
 */

package com.minte9.basics.loops;

import java.util.Arrays;
import java.util.List;

public class ForEach {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3);

        // lambda
        numbers.forEach(x -> System.out.println(x)); // 1, 2, 3

        // method reference
        numbers.forEach(System.out::println); // 1, 2, 3
    }
}
