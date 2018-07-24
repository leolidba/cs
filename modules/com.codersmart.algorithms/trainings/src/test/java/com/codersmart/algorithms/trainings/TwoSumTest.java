package com.codersmart.algorithms.trainings;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TwoSumTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void getTwoSum() {
        Assertions.assertArrayEquals(new int[]{2, 5}, TwoSum.getTwoSum(new int[] {1, 2, 3, 4, 5, 7, 11}, 10));
    }

    @Test
    void getTwoSumBest() {
        Assertions.assertArrayEquals(new int[]{2, 5}, new TwoSum().getTwoSumBest(new int[] {1, 2, 3, 4, 5, 7, 11}, 10));
    }
}