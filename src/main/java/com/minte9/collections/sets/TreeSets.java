/**
 * TreeSet is similar to HashSet in that it prevents duplicates.
 * But it also keeps the list sorted (very small performance hit).
 */

package com.minte9.collections.sets;

import java.util.ArrayList;
import java.util.TreeSet;

public class TreeSets {
    public static void main(String[] args) {

        ArrayList<A> myList = new ArrayList<>();
        myList.add(new A("F", "1"));
        myList.add(new A("G", "2"));
        myList.add(new A("H", "4"));
        myList.add(new A("H", "3"));
        
        TreeSet<A> myTree = new TreeSet<A>();
        myTree.addAll(myList);
        System.out.println(myTree); // [F:1, G:2, H:4]
    }
}

class A implements Comparable<A> {

    public String title;
    public String artist;
    
    public A(String t, String a) {
        title = t;
        artist = a;
    }

    @Override public int compareTo(A a) {
        return title.compareTo(a.title);
    }
    
    @Override public String toString() {
        return title + ":" + artist;
    }
}