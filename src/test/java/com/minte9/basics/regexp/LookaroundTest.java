package com.minte9.basics.regexp;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.Test;

public class LookaroundTest {  

    public static boolean find(String regex, String str) {
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);
        return m.find();
    } 
    
    @Test public void lookBehind() {
        assertTrue(find("(?<=a)xyz", "axyz"));  // Look behind for a (true)
        assertFalse(find("(?<=b)xyz", "axyz")); // Look befind for a (false)
    }

    @Test public void lookAhead() {
        assertTrue(find("(?=x)xyz", "axyz"));   // Look ahead for x (true)
        assertFalse(find("(?=x)axyz", "axyz")); // Look ahead for x (false
    } 

    @Test public void lookBehindNegative() {
        assertFalse(find("(!?<=a)xyz", "axyz")); // Look behind for !a (false)
    }

    @Test public void lookAheadNegative() {
        assertFalse(find("(?!x)xyz", "axyz"));   // Look ahead for !x (false)
    }
}