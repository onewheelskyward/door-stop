package me.myself.and.i;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class GreetingTest
        extends TestCase {

    /**
     * Testing!
     *
     * @param testName
     */
    public GreetingTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(GreetingTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testGreeting() {
        assertTrue(true);
    }
}
