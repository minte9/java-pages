package com.minte9.collections.streams;

import java.util.Arrays;

public class Primitives {
    public static void main(String[] args) {
        
        Arrays.stream(new int[] {1, 2, 3})
            .map(n -> n * 2)
            .average()
            .ifPresent(System.out::println); 
                // 4.0
        
    }
}
