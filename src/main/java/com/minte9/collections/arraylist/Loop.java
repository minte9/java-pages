/**
 * ArrayList can be parsed easily with enhanced for.
 * 
 * ArrayDeque can add elements to the head as fast as to the tail.
 * If you are modifing the tail only, the ArrayList is a preferred.
 */

package com.minte9.collections.arraylist;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class Loop {    
    public static void main(String[] args) {
        
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("a");
        myList.add("b");
        myList.add(0, "c"); // add to first position

        for(String v:myList) {
            System.out.println(v); // c a b
        }

        ArrayDeque<Integer> myDeque = new ArrayDeque<>();
        myDeque.addFirst(1);
        myDeque.add(2);
        myDeque.addLast(10);
        myDeque.forEach(System.out::println); // 1 2 10
    }
}
