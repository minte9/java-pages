/**
 * Pattern, Matcher
 * 
 * The Pattern matches() if all the string match the pattern
 * To check only parts of the string find() is used
 */

package com.minte9.basics.regexp;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matches {
    public static void main(String[] args) {

        Pattern p = Pattern.compile("Java");
        Matcher m = p.matcher("Java SE 8");

        System.out.println(m.matches()); // false 
        System.out.println(m.find());    // true
    }
}