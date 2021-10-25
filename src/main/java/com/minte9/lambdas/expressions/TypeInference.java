/**
 * Javac type inference is smart, but it needs enought information. 
 */

package com.minte9.lambdas.expressions;
import java.util.function.Function;

public class Type {
    public static void main(String[] args) {

        // Wrong - doesn't compile
        /*
            Function op = x -> x + 1;
        */

        // Correct
        Function<Long, Long> op = x -> x + 1;
        System.out.println(op.apply(20L)); // 21
    }
}