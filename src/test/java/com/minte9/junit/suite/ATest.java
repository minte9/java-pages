/**
 * A Test - used in SuiteTest
 */

package com.minte9.junit.suite;
import org.junit.BeforeClass;
import org.junit.Test;

public class ATest {

    @BeforeClass static public void before() {
        if(System.getProperty("resource_loaded") == "1") {
            System.out.println("Db connect in A - skipped");
            return;
        }
        System.out.println("Db connect in A");
    }

    @Test public void test() {
        System.out.println("test A");
    }
}