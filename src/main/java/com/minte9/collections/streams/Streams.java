/**
 * With Java 8 Streams we can make bulk operations ...
 * sequentiallly or paralel.
 * 
 * The source for streams can be arrays, files, regex, etc.
 * We don't have to create a collection in order to work with streams.
 */

package com.minte9.collections.streams;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        
        List<String> myList = Arrays.asList("aa", "ba", "bc");
        myList
            .stream()
            .filter(s -> s.startsWith("b"))
            .map(String::toUpperCase)
            .sorted()
            .forEach(System.out::println);  
                // BA BC

        Stream.of("aa", "ba", "bc") // no collection
            .filter(s -> s.startsWith("b"))
            .map(String::toUpperCase)
            .sorted()
            .forEach(System.out::println); 
                // BA BC    

        Arrays.stream(new int[] {1, 2, 3}) // primitives
            .map(n -> n * 2)
            .average()
            .ifPresent(System.out::println); 
                // 4.0
    }
}
