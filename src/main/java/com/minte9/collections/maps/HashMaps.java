/**
 * In a HashMap you can have duplicate values ...
 * but no duplicate keys.
 */

package com.minte9.collections.maps;
import java.util.HashMap;

public class Hashmaps {
    public static void main(String[] args) {
    
        HashMap<String, Integer> scores = 
            new HashMap<String, Integer>();
        
        scores.put("a", 1);
        scores.put("a", 2); // overrites "a" key
        scores.put("b", 2);
        scores.put("c", 2);

        System.out.println(scores); // {a=2, b=2, c=2}

        System.out.println(
            scores.get("a") // 2
        );
    }
}
