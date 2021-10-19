/**
 * In the followingcode you might have expect two matches: 
 * "extend" and "end"
 * 
 * This is call GREEDY behavior ...
 * which match the longest sequence.
 * 
 * Use "?" modifier for UNGREEDY behavior
 */

package com.minte9.basics.regexp;
import java.util.regex.*;

public class Greedy {
    public static void main(String[] args) {

        // greedy
        Pattern p = Pattern.compile("e.+d");
        Matcher m = p.matcher("extend cup end table");

        while(m.find()) {
            System.out.println(m.group());
                // extend cup end
        }

        // ungreedy
        Pattern p2 = Pattern.compile("e.+?d"); // Look Here
        Matcher m2 = p2.matcher("extend cup end table");

        while(m2.find()) {
            System.out.println(m2.group());
                // extend
                // end
        }
    }
}
