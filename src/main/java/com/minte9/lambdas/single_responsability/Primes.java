/**
 * A prime number is a natural number greater than 1 ...
 * that is not a product of two smaller natural numbers. 
 * 
 * Primes counting App ...
 * 
 * Multiple responsabilities: counting & checking
 */

package com.minte9.lambdas.single_responsability;
import static org.junit.Assert.assertEquals;

public class Primes {
    public static void main(String[] args) {
        
        assertEquals(4, noOfPrimes(10)); 
            // pass
    }

    public static long noOfPrimes(int limit) {

        int n = 0;
        for (int i=2; i<limit; i++) { // counting

            for (int j=2; j<i; j++) { // checking

                if (i%j == 0) { // is prime

                    n++;
                    break;
                }
            }
        }
        return n;
    }
}