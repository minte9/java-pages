package com.minte9.basics.regexp;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lookaround {  

    public static void main(String[] args) {

        // Look Behind
        Pattern p = Pattern.compile("(?<=a)xyz");
        Matcher m = p.matcher("axyz");
        System.out.println(m.find()); // true

        // Look Ahead
        Pattern p2 = Pattern.compile("(?=x)xyz");
        Matcher m2 = p2.matcher("axyz");
        System.out.println(m2.find()); // true
    }
}