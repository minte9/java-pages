/**
 * Greedy, Ungreedy
 * 
 * Greedy behavior match the longest sequence
 * Use "?" modifier for ungreedy behavior
 */

package com.minte9.basics.regexp;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Greedy {
    public static void main(String[] args) {

        Pattern p;
        Matcher m;

        p = Pattern.compile("e.+d"); // Greedy
        m = p.matcher("extend cup end table");
        while(m.find()) {
            System.out.println(m.group()); // extend cup end
        }

        p = Pattern.compile("e.+?d"); // Ungreedy
        m = p.matcher("extend cup end table");
        while(m.find()) {
            System.out.println(m.group()); // extend, end
        }

        p = Pattern.compile("Java ?(8|SE)"); // Ungreedy
        m = p.matcher("Java 8 Java SE");
        while(m.find()) {
            System.out.println(m.group()); // Java 8 , Java SE
        }
    }
}