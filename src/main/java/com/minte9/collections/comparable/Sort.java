/**
 * ArrayList doesn't have a sort method.
 * 
 * There is a sort method in the Collections class ...
 * that takes a List as argument.
 */

package com.minte9.collections.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Sort {
    public static void main(String[] args) {

        ArrayList<String> myList = new ArrayList<>();
        myList.add("AB");
        myList.add("BC");
        myList.add("AD");

        Collections.sort(myList); // Look Here
        System.out.println(myList); // [AB, AD, BC]
    }
}

