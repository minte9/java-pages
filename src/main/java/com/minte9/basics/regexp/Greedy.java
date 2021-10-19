/**
 * In the followingcode you might have expect two matches: 
 * "extend" and "end"
 * 
 * This is call "greedy behavior" ...
 * which match the longest sequence.
 */

package com.minte9.basics.regexp;
import java.util.regex.*;

public class Greedy {
    public static void main(String[] args) {

        Pattern p = Pattern.compile("e.+d"); // Look Here
        Matcher m = p.matcher("extend cup end table");

        while(m.find()) {

            System.out.println(m.group());
                // extend cup end
        }
    }
}
