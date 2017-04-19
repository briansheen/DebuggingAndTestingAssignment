package com.example;


import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.*;


/**
 * Created by bsheen on 4/18/17.
 */
public class AnalyticsImplTest {
    AnalyticsImpl analyticsImpl;
    Event event;

    @Before
    public void setUp() {
        analyticsImpl = new AnalyticsImpl();
        event = new Event();
    }

    @Test
    public void testGreen() throws InterruptedException {
        event.setName("brian");
        event.setAction("birthday!");
        event.setAt(LocalDateTime.now());
        assertTrue(analyticsImpl.addEvent(event));
    }

    @Test
    public void testNullName() throws InterruptedException {
        event.setName(null);
        event.setAction("birthday!");
        event.setAt(LocalDateTime.now());
        try {
            assertFalse(analyticsImpl.addEvent(event));
            fail("should have returned IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testBlankName() throws InterruptedException {
        event.setName("      ");
        event.setAction("birthday!");
        event.setAt(LocalDateTime.now());
        try {
            assertFalse(analyticsImpl.addEvent(event));
            fail("should have returned IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testNullAction() throws InterruptedException {
        event.setName("brian");
        event.setAction(null);
        event.setAt(LocalDateTime.now());
        try {
            assertFalse(analyticsImpl.addEvent(event));
            fail("should have returned IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testBlankAction() throws InterruptedException {
        event.setName("brian");
        event.setAction("");
        event.setAt(LocalDateTime.now());
        try {
            assertFalse(analyticsImpl.addEvent(event));
            fail("should have returned IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testNullAt() throws InterruptedException {
        event.setName("brian");
        event.setAction("birthday!");
        event.setAt(null);
        try {
            assertFalse(analyticsImpl.addEvent(event));
            fail("should have returned IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }



}
