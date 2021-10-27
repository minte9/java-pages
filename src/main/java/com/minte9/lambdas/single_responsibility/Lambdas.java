/**
 * With lambdas you can easily make methods that are in line with SRP ...
 * one responsability and encapsulation.
 */

package com.minte9.lambdas.single_responsibility;
import static org.junit.Assert.assertEquals;
import java.util.stream.IntStream;

public class Lambdas {
    public static void main(String[] args) {
        assertEquals(25, countPrimes(100)); // pass
    } 

    public static long countPrimes(int limit) {
        return IntStream.range(2, limit)
            .filter(Lambdas::isPrime)
            .count()
        ;
    }

    private static boolean isPrime(int number) {
        return IntStream.range(2, number)
            .allMatch(x -> number % x != 0)
        ;
    }
}