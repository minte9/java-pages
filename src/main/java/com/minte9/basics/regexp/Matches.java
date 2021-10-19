/**
 * In Java the match() must be for all string to return true
 * 
 * To check only parts of the string find() is used
 */

package com.minte9.basics.regexp;
import java.util.regex.*;

public class Matches {
    public static void main(String[] args) {

        Pattern p = Pattern.compile("Java");
        Matcher m = p.matcher("Java SE 8");

        System.out.println(
            m.matches() // false 
        );

        System.out.println(
            m.find() // true
        );
    }
}
