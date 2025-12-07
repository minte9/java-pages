package com.minte9.junit.test_suite;

import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        UserTest.class,
        OrderTest.class
})
public class SuiteTest {

    @BeforeClass
    public static void globalSetup() {
        System.out.println("Connecting to test database...");
    }

    @AfterClass
    public static void globalTeardown() {
        System.out.println("Closing test databases...");
    }
}

/*
    Connecting to test database...
    Running UserTest.testCreateUser
    Running UserTest.testDeleteUser
    Running OrderTest.testPlaceOrder
    Closing test databases...
 */