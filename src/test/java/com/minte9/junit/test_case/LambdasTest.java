/**
 * Test Case - AssertEquals Lambdas Example
 */

package com.minte9.junit.test_case;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class LambdasTest {
    
    @Test public void mytest() {

        SQ squares = new SQ();
        squares.add(() -> 3 * 3); // Look Here
        squares.add(() -> 5 * 5);

        assertEquals(squares.average(), 17); // passed
    }
}

class SQ {

    private List<Square> squares = new ArrayList<>(); // Look Here

    public void add(Square s) { 
        squares.add(s); 
    }

    public int average() {
        int total = squares.stream().mapToInt(Square::get).sum();
        return total / squares.size();
    }
}

@FunctionalInterface interface Square { // Look Here
    int get(); 
}
