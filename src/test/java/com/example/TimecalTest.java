package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TimecalTest {

    Timecal timecal = new Timecal();

    @Test
    public void testCalculateTime() {
        assertEquals(1.0, timecal.calculateTime(100,100));
    }
}
