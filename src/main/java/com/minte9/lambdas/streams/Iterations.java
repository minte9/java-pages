
/**
 * Streams allow us to write collections code ...
 * at a higher level of abstraction. 
 * 
 * Iterator uses external iteration.
 * Streams are known as internal interations. 
 */

package com.minte9.lambdas.streams;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Iterations {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3);
        int count;

        count = 0;
        for(int n : numbers) {
            if (n <= 2) {
                count++;
            }
        }
        System.out.println(count); 
            // 2

        count = 0;
        Iterator<Integer> it = numbers.iterator();
        while(it.hasNext()) {
            int n = it.next();
            if (n <= 2) {
                count++;
            }
        }
        System.out.println(count); 
            // 2

        long total = 0;
        total = numbers.stream()
                .filter(n -> n <= 2)
                .count();
        System.out.println(total); 
            // 2
    }
}
