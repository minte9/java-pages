/**
 * Importing java.uitl.* imports all of the types ...
 * in the java.util package but it does not import ...
 * java.util.regex package
 */

package com.minte9.oop.packages;

//import java.util.*; // not used
//import java.util.regex.Matcher; // Look Here
import java.util.regex.Pattern;

public class Hierarchy {
    public static void main(String[] args) {
        
        Pattern p = Pattern.compile("Java");
        java.util.regex.Matcher m = p.matcher("Java SE 8");

        System.out.println(m.find()); // true
    }
}