/**
 * Primitives types cannot be used in Collections or Generics.	
 * Java compiler makes automatic convertions to primitives. 
 * 
 * Unboxing is the automatic conversion of objects into their ...
 * coresponding primitives
 */

package com.minte9.basics.numbers;

import java.util.List;
import java.util.ArrayList;

public class Autoboxing {
    public static void main(String[] args) {
        
        List<Integer> li = new ArrayList<>();

        for (int i=10; i<20; i++) { 
            li.add(i); // autoboxing (i is primitive)
        }

        System.out.println(li.get(0).getClass().getName());
            // java.lang.Integer

        int b = li.get(0); // unboxing (element is Integer)
        
        System.out.println(b); // 10
    }
}
