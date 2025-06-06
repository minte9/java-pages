/**
 * Test Cases - with Generic type params
 */

package com.minte9.junit.test_case;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class GenericsTest {

    @Test public void integers() {
        
        MyList<Integer> numbers = new MyList<>();
        numbers.add(3);
        numbers.add(5);

        assertEquals(numbers.sum(), 8); // passed
    }

    @Test public void doubles() {
        
        MyList<Double> numbers = new MyList<>();
        numbers.add(3.0);
        numbers.add(5.0);

        assertEquals(numbers.sum(), 8);        // passed
        assertNotEquals(numbers.sum(), "8.0"); // passed
    }
}

class MyList<T extends Number> {

    private List<T> items = new ArrayList<>();

    public void add(T t) {
        items.add(t); 
    }

    public int sum() { 
        return items.stream()
                    .mapToInt(Number::intValue)
                    .sum();
    }
}
