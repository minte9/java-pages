/**
 * The Problem: 
 * 
 * Given a list of integers, 
 * find the square of all the even numbers
 * and return them in a new list.
 */

package com.minte9.collections.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Declarative {
    
    public static void main(String[] args) {

        List<Integer> mylist = Arrays.asList(
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        );


        /**
         * Imperative programming style
         */
        List<Integer> mySquareList = new ArrayList<>();
        for(Integer n : mylist) {
            if (n % 2 == 0) {
                mySquareList.add(n * n);
            }
        }
        System.out.println(mySquareList); // [4, 16, 36, 64, 100]


        /**
         * Declarative programming (streams without lambdas)
         * 
         * Might look more confusing, but it cleary stating
         * what operation each part of the stream is doing
         */
        mySquareList = mylist.stream()
            .filter(
                new Predicate<Integer>() {
                    @Override public boolean test(Integer n) {
                        return n % 2 == 0;
                    }
                })
            .map(
                new Function<Integer, Integer>() {
                    @Override public Integer apply(Integer n) {
                        return n * n;
                    }
                }
            )
            .collect(Collectors.toList());
        System.out.println(mySquareList); // [4, 16, 36, 64, 100]


        /**
         * Declarative programming (lambdas)
         * 
         * Simple and reusable
         */
        mySquareList = mylist.stream()
            .filter(x -> x % 2 == 0)
            .map(y -> y * y)
            .collect(Collectors.toList());
        System.out.println(mySquareList); // [4, 16, 36, 64, 100]
    }
}
