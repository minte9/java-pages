/**
 * Primitives types cannot be used in Collections or Generics.	
 * Java compiler makes automatic convertions to primitives. 
 */

package com.minte9.basics.numbers;

import java.util.List;
import java.util.ArrayList;

public class Autoboxing {
    public static void main(String[] args) {
        
        List<Integer> li = new ArrayList<>();

        for (int i=0; i<10; i++) { 
            li.add(i);
                // i is primitive
        }

        System.out.println(li.get(0).getClass().getName());
            // java.lang.Integer
    }
}
