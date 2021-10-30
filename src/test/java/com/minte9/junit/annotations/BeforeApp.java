/** 
 * Before method - exectuted before each test.
 * 
 * JUnit creates a new instance for each test it runs.
 */

package com.minte9.junit.annotations;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class BeforeApp {
    private Squares squares;

    @Before public void executedBeforeEach() { // Look Here
        
        squares = new Squares();
        squares.add(3); // 9
        squares.add(5); // 25

        System.out.println("Squares initialized!"); // executed twice
            // Squares initialized!
            // Squares initialized!
    }
    
    @Test public void average() {
        assertEquals(squares.average(), 17); // passed
    }

    @Test public void sum() {
        assertEquals(squares.sum(), 34); // passed
    }
}

class Squares {

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
