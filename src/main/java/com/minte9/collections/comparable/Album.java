/**
 * When you are sorting objects, the compiler doesn't know what to sort.
 * The object by we sort needs to implements Comparable.
 */

package com.minte9.collections.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Album {    
    public static void main(String[] args) {

        ArrayList<Song> myList = new ArrayList<Song>();
        myList.add(new Song("Song A"));
        myList.add(new Song("Song B"));
        myList.add(new Song("Song C"));
        
        Collections.sort(myList); 
        System.out.println(myList); // [Song A, Song B, Song C]
    
    }
}

class Song implements Comparable<Song> {
        
    String title;
    
    @Override public int compareTo(Song s) {

        return title.compareTo(s.title); // Look Here

            // Uses overrided method toString()
    }
    
    public Song(String t) {
        title = t;
    }
    
    @Override public String toString() {
        return title;
    }
}
