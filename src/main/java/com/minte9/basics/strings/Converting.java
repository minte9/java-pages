/**
 * To convert String to int use valueOf()
 * To convert int to String use toString()
 */

package com.minte9.basics.strings;

public class Converting {
    public static void main(String[] args) {
        
        String a1 = "1";
        String a2 = "1.11";
        Integer b1 = Integer.valueOf(a1);
        Float b2 = Float.valueOf(a2);

        System.out.println(b1 + b2); // 2.1100001

        int i = 11;
        String a = "" + i;
        String b = String.valueOf(i);
        String c = Integer.toString(i);

        System.out.println(a); // 11
        System.out.println(b); // 11
        System.out.println(c); // 11
    }
}
