/**
 * SuiteTest - running A and B classes
 * 
 * Test suites help to group and execute tests in bulk.
 * Executing tests separately is expensive (db connect exemple).
 */

package com.minte9.junit.suite_test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class) 
@SuiteClasses({ATest.class, BTest.class}) // Look Here
public class SuiteTest {
    
    @BeforeClass static public void before() {
        System.setProperty("resource_loaded", "1");
        System.out.println("Db connect");
    }

    @AfterClass static public void after() {
        System.out.println("Db close");
    }

    /* 
        Db connect
        Db connect in A - skipped
        test A
        Db connect in B
        test B
        Db close
    */
}