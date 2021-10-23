/**
 * HashSet have no duplicates, but no sorting.
 */

package com.minte9.collections.sets;

import java.util.HashSet;

public class Hashsets {            
    public static void main(String[] args) {     

        HashSet<Song> mySet = new HashSet<Song>();
        mySet.add(new Song("A", "2"));
        mySet.add(new Song("C", "1"));
        mySet.add(new Song("B", "4"));
        mySet.add(new Song("B", "3"));
        
        System.out.println(mySet); // [A:2, B:4, C:1]
            // no duplicates
    }
}

class Song implements Comparable<Song>{

    public String title;
    public String artist;
    
    @Override public boolean equals(Object o) {
        Song s = (Song) o;
        return title.equals(s.title);
    }

    @Override public int hashCode() { // no duplicates
        return title.hashCode();
    }
    
    @Override public int compareTo(Song s) {
        return title.compareTo(s.title);
    }
    
    public Song(String t, String a) {
        title = t;
        artist = a;
    }
    
    @Override public String toString() {
        return title + ":" + artist;
    }
}