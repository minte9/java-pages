/**
 * Test Case - AssertEquals Example
 * 
 * AAA (Arrange, Act, Assert)
 */

package com.minte9.junit.test_case;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class CaseTest {

    @Test public void mytest() { // Look Here
        
        // Arange
        Squares squares = new Squares();
        squares.add(3); // 9
        squares.add(5); // 25

        // Act
        int actual = squares.average();  // 9 + 25 = 34
        int expected = 17;

        // Assert
        assertEquals(actual, expected); // passed
    }
}

class Squares {

    private List<Integer> squares = new ArrayList<>();

    public void add(int x) {
        squares.add(x * x); 
    }

    public int average() { 
        int total = squares.stream().mapToInt(Integer::intValue).sum();
        return total / squares.size(); 
    }
}
