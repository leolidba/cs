package com.codersmart.algorithms.trainings;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TwoSumTest {

    static private TwoSum twoSum = new TwoSum();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void getTwoSum() {
        Assertions.assertArrayEquals(new int[]{2, 5}, twoSum.getTwoSum(new int[] {1, 2, 3, 4, 5, 7, 11}, 10));
    }

    @Test
    void getTwoSumBest() {
        Assertions.assertArrayEquals(new int[]{2, 5}, twoSum.getTwoSumBest(new int[] {1, 2, 3, 4, 5, 7, 11}, 10));
    }
}