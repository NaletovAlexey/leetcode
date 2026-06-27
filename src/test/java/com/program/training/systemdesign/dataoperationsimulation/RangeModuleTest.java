package com.program.training.systemdesign.dataoperationsimulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Q1. Range Module
 *
 * @author naletov
 */
class RangeModuleTest
{

    @Test
    void testRangeModule()
    {
        RangeModule rangeModule = new RangeModule();
        rangeModule.addRange(10, 20);
        rangeModule.removeRange(14, 16);
        assertTrue(rangeModule.queryRange(10, 14), "return True,(Every number in [10, 14) is being tracked)");
        assertFalse(rangeModule.queryRange(13, 15), "return False,(Numbers like 14, 14.03, 14.17 in [13, 15) are not being tracked)");
        assertTrue(rangeModule.queryRange(16, 17), "return True, (The number 16 in [16, 17) is still being tracked, despite the remove operation)");
    }
}