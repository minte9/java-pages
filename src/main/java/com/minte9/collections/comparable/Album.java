/**
 * When you are sorting objects, the compiler doesn't know what to sort.
 * The object by we sort needs to implements Comparable.
 * 
 * Comparator is external to the element type you're comparing ...
 * it is a separate class.
 * 
 * You can make as many of these as you like!
 */

package com.minte9.collections.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Album {    
    public static void main(String[] args) {

        ArrayList<Song> myList = new ArrayList<Song>();
        myList.add(new Song("A", "1"));
        myList.add(new Song("B", "3"));
        myList.add(new Song("C", "2"));
        
        Collections.sort(myList); 
        System.out.println(myList); // [A:1, B:3, C:2]

        Collections.sort(myList, new ArtistComparator());
        System.out.println(myList); // [A:1, C:2, B:3]
    }
}

class Song implements Comparable<Song> {
        
    String title;
    String artist;
    
    @Override public int compareTo(Song s) {
        return title.compareTo(s.title); // Look Here
            // Uses overrided method toString()
    }
    
    public Song(String t, String a) {
        title = t;
        artist = a;
    }
    
    @Override public String toString() {
        return title + ":" + artist;
    }
}

class ArtistComparator implements Comparator<Song> {
    @Override public int compare(Song first, Song second) {

        return first.artist.compareTo(second.artist); // Look Here
            // second compartions using Comparator
    }
}
