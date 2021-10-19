/**
 * Java does not permit strings to span lines.
 * 
 * To span strings on multiple lines, use:
 * a) concatenation operator +
 * b) String.join()
 * c) Text Block """ (starting with JDK15)
 */

package com.minte9.basics.strings;

public class Multilines {
    public static void main(String[] args) {
        
        //concatation
        String msg = ""
            + "AAA "
            + "BBB"
        ;
        System.out.println(msg);
            // AAA BBB


        // join
        String msg2 = String.join("\n",
            "CCC",
            "DDD"
        );
        System.out.println(msg2);
            // CCC 
            // DDD
    }
}
