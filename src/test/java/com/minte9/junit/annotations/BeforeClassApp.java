/**
 * BeforeClass method - executed once before all tests.
 * 
 * JUnit creates a new instance for each test it runs.
 */

package com.minte9.junit.annotations;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.BeforeClass;
import org.junit.Test;

public class BeforeClassApp {
    private static SQ squares;

    @BeforeClass static public void executedBeforeOnce() { // Look Here
        
        squares = new SQ();
        squares.add(3); // 9
        squares.add(5); // 25

        System.out.println("Squares initialized!"); // executed once
            // Squares initialized!
    }
    
    @Test public void average() {
        assertEquals(squares.average(), 17); // passed
    }

    @Test public void sum() {
        assertEquals(squares.sum(), 34); // passed
    }
}

class SQ {

    private List<Integer> squares = new ArrayList<>();

    public void add(int x) {
        squares.add(x * x); 
    }

    public int average() { 
        return sum() / squares.size(); 
    }

    public int sum() { 
        return squares.stream().mapToInt(Integer::intValue).sum();
    }
}
