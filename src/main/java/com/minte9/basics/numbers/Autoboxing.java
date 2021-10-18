/**
 * Primitives types {{cannot}} be used in Collections or Generics.	
 * 
 * Java compiler makes automatic convertions to primitives. 
 */

package com.minte9.basics.numbers;

import java.util.List;
import java.util.ArrayList;

public class Autoboxing {
    public static void main(String[] args) {
        
        List<Integer> li = new ArrayList<>();

        /**
         * You add int to the Integer object ...
         * and still the code compiles
         */
        for (int i=0; i<10; i++) {
            li.add(i);
        }
    }
}
