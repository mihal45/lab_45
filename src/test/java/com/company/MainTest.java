package com.company;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {


    public static double[] nums = new double[] {76.66666666666666, 81.66666666666666, 70.0};

    @org.junit.jupiter.api.Test
    void min() {
        Main main = new Main();
        assertEquals(true, main.min(nums, 4));
    }


    @org.junit.jupiter.api.Test
    void max() {
        Main main = new Main();
        assertEquals(false, main.max(nums, 4));
    }
}