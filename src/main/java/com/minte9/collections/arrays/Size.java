/**
 * In Java ArrayList class is a resizable array.
 * It doesn't need an index and are parameterized.
 */

package com.minte9.collections.arrays;

import java.util.ArrayList;

public class Size {    
    public static void main(String[] args) {
        
        String[] myList = new String[2]; // Corect, with dimension
        System.out.println(myList.length); // 2

        // ❌ This won't work, you must provide array size
        // myList = new String[];

        ArrayList<String> myArrayList;
        myArrayList = new ArrayList<>(); // no dimension needed
        System.out.println(myArrayList.size()); // 0

        myArrayList.add("a");
        System.out.println(myArrayList.size()); // 1
        System.out.println(myArrayList.contains("a")); // true

        ArrayList<Button> myButtons = new ArrayList<>(); // parameterized
        myButtons.add(new Button());
        System.out.println(myButtons.size()); // 1
    }
}

class Button {}