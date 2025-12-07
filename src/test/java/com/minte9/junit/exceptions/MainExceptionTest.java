/**
 * Testing an application with no argumets in main()
 */

package com.minte9.junit.exceptions;
import org.junit.Test;

public class NoArgs {

    @Test public void no_args() { // Failed
        App.main(new String[] {}); 
            // ArrayIndexOutOfBoundsException
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void no_args_expected() {
        App.main(new String[] {}); // Passed
    }

    @Test public void args() {
        App.main(new String[] {"run"}); // Passed
    }
}

class App {
    public static void main(String[] args) {
        String action = args[0];
        System.out.println(action);
    }
}