/**
 * Use Pattern split() to break the string in parts ...
 * using regex pattern 
 */

package com.minte9.basics.regexp;

import java.util.regex.Pattern;

public class Split {
    public static void main(String[] args) {

        Pattern p = Pattern.compile("[ ,.!]");
        String ss[] = p.split("one two,alpha9 12!done.");
        
        for (String s : ss) {
            System.out.println(s);
            /*
                one
                two
                alpha9
                12
                done
            */
        }
    }
}

