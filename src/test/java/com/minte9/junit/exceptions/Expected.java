/**
 * Expected exception parameter ...
 * 
 * You can pass an expected exception into the ...
 * Test annotation definition.
 */

package com.minte9.junit.exceptions;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class Expected {

    @Test public void no_squares() { // Failed
        Squares squares = new Squares();
        squares.average(); 
            // ArithmeticException: / by zero
    }

    @Test(expected = ArithmeticException.class)
    public void no_squares_expected() {
        Squares squares = new Squares(); // Passed
        squares.average();  
    }

    @Test public void average() { // Passed
        Squares squares = new Squares();
        squares.add(3); // 9
        squares.add(5); // 25
        assertEquals(squares.average(), 17);
    }
}

class Squares {
    private List<Integer> squares = new ArrayList<>();

    public void add(int x) {
        squares.add(x * x); 
    }

    public int average() throws ArithmeticException {
        int total = squares.stream().mapToInt(Integer::intValue).sum();
        return total / squares.size();
    }
}