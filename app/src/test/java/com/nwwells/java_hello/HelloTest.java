package com.nwwells.java_hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class HelloTest {

    private class HelloSub extends Hello {
        public HelloSub(String[] args) {
            super(args);
        }
    }

    @Test
    public void testClone() {
        String[] args = { "Test", "clone" };
        Hello source = new Hello(args);
        Hello clone;
        try {
            clone = (Hello) source.clone();
        } catch (CloneNotSupportedException e) {
            clone = null;
            fail("clone should never fail");
        }
        assertFalse(clone == source, "Clone and source should not be identical");
        assertEquals(clone, source, "Clone and source should be equal");
        assertEquals(clone.toString(), source.toString(), "Clone and source greeting should be equal");
    }

    @Test
    public void testEquals() {
        String[] argsA = { "Test", "equals" };
        String[] argsB = { "Test", "equals" };
        String[] argsC = { "Test", "not", "equals" };
        Hello helloA = new Hello(argsA);
        Hello helloB = new Hello(argsB);
        Hello helloC = new Hello(argsC);
        HelloSub helloSub = new HelloSub(argsA);
        assertEquals(helloA, helloB);
        assertEquals(helloA, helloA);
        assertNotEquals(helloA, null);
        assertNotEquals(helloA, helloSub);
        assertNotEquals(helloA, helloC);
    }

    @Test
    public void testHashCode() {
        String[] argsA = { "Test", "hashCode" };
        String[] argsB = { "Test", "hashCode" };
        Hello helloA = new Hello(argsA);
        Hello helloB = new Hello(argsB);
        assertEquals(helloA.hashCode(), helloB.hashCode());
    }

    @Test
    public void testToString() {
        String[] args = { "Test", "toString" };
        Hello hello = new Hello(args);
        assertEquals("Hallo, Test toString!", hello.toString());
    }

    @Test
    public void testNullInput() {
        Hello hello = new Hello((String[]) null);
        assertEquals("Hallo, Welt!", hello.toString());
    }

    @Test
    public void testEmptyArgs() {
        String[] args = {};
        Hello hello = new Hello(args);
        assertEquals("Hallo, Welt!", hello.toString());
    }
}
