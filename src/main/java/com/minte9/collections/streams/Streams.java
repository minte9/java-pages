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

public class Lists {
    public static void main(String[] args) {
        
        List<String> myList = Arrays.asList("aa", "ba", "bc");
        myList
            .stream()
            .filter(s -> s.startsWith("b"))
            .map(String::toUpperCase)
            .sorted()
            .forEach(System.out::println);  
                // BA BC

        Stream.of("aa", "ba", "bc")
            .filter(s -> s.startsWith("b"))
            .map(String::toUpperCase)
            .sorted()
            .forEach(System.out::println); 
                // BA BC    
    }
}
