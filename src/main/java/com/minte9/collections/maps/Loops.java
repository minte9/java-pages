/**
 * To parse a HashMap use for loop with ...
 * 
 * keySet(), if you need only the keys,
 * values(), if you need only the values,
 * entrySet(), if you need both. 
 */

package com.minte9.collections.maps;

import java.util.HashMap;
import java.util.Map;

public class Loops {
    public static void main(String[] args) {
    
        HashMap<String, Integer> scores = 
            new HashMap<String, Integer>();
        
        scores.put("a", 1);
        scores.put("b", 2);
        scores.put("c", 3);

        for (String key : scores.keySet()) {
            System.out.println(key); 
                // a b c
        }

        for(Object value : scores.values()) {
            System.out.println(value); 
                // 1 2 3
        }

        for(Map.Entry<String, Integer> entry : scores.entrySet()) {
            
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println(key + value); 
                // a1 b2 c3
        }
    }
}
