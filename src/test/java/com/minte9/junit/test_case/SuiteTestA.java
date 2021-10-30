package com.minte9.junit.test_case;
import org.junit.BeforeClass;
import org.junit.Test;

public class SuiteTestA {

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