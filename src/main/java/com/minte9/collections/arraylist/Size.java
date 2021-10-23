/**
 * ArrayList class is a resizable array,
 * ArrayList don't need an index and are parameterized.
 */

package com.minte9.collections.arraylist;

import java.util.ArrayList;

public class Size {    
    public static void main(String[] args) {
        
        String[] myList = new String[2]; // Corect, with dimension
        System.out.println(myList.length); // 2

        // myList = new String[]; 
            // Error: must provide dimension

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

class Button {

}