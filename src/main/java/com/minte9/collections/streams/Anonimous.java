/**
 * Streams are collection of objects on which you can apply ...
 * various methods while they are in the pipeline of execution.
 * 
 * Lambdas are language constructs that remove the need of ...
 * writing anonymous functions.
 */

package com.minte9.collections.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Anonimous {
    public static void main(String[] args) {

        /**
         * Filter:
         * ----------------
         * Only elements that meet the condition ...
         * will be passed to the next function in the pipeline
         */
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.stream()
            .filter(x -> x % 2 == 0)
            .forEach(System.out::println); 
                // 2 4
            
        /** 
         * Map:
         * ---------------
         * Used to transform an element into other element
         */
        List<String> letters = Arrays.asList("a", "b", "c");
        letters.stream()
            .map(x -> x.toUpperCase())
            .forEach(System.out::println); 
                // A B C

        /**
         * ForEach:
         * ---------------
         * Runs for every element in the stream
         */
        List<Integer> myNumbers = Arrays.asList(1, 2, 3, 4, 5);
        myNumbers.stream()
            .filter(x -> x % 2 == 0)
            .map(x -> x * x)
            .forEach(System.out::println); 
                // 4 16

        /**
         * Collect:
         * ----------------
         * Collects every element in the stream to another collection
         */
        List<String> myList = Arrays.asList("London", "Paris", "London");
        Set<String> mySet = myList.stream()
            .filter(x -> x.length() % 2 == 0)
            .collect(Collectors.toSet()); // no duplicates (Set)
        System.out.println(mySet); 
            // [London]
        
    }
}