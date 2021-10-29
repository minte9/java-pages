package com.minte9.basics.regexp;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.Test;

public class LookaroundTest {  

    public static boolean find(String str, String regex) {
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);
        return m.find();
    } 
    
    @Test public void lookBehind() {
        assertTrue(find("axyz", "(?<=a)xyz")); // pass
        assertFalse(find("axyz", "(?<=b)xyz")); // pass
    }

    @Test public void lookAhead() {
        assertTrue(find("axyz", "(?=x)xyz")); // pass
        assertFalse(find("axyz", "(?=x)axyz")); // pass
    } 

    @Test public void lookBehindNegative() {
        assertFalse(find("axyz", "(!?<=a)xyz")); // pass
    }

    @Test public void lookAheadNegative() {
        assertFalse(find("axyz", "(?!x)xyz")); // pass
    }
}