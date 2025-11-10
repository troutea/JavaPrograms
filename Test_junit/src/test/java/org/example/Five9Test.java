package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Five9Test {

    private int[] originalArray;

    @BeforeEach
    void setUp() {
        // Save the original array before each test
        originalArray = Five9.arr.clone();
    }

    @AfterEach
    void tearDown() {
        // Restore the original array after each test
        Five9.arr = originalArray;
    }

    @Test
    void testSumWithDefaultArray() {
        // Test with the default array {12, 3, 4, 15}
        int expectedSum = 34;
        int actualSum = Five9.sum();
        assertEquals(expectedSum, actualSum, "Sum of {12, 3, 4, 15} should be 34");
    }

    @Test
    void testSumWithAllPositiveNumbers() {
        Five9.arr = new int[]{1, 2, 3, 4, 5};
        int expectedSum = 15;
        int actualSum = Five9.sum();
        assertEquals(expectedSum, actualSum, "Sum of {1, 2, 3, 4, 5} should be 15");
    }

    @Test
    void testSumWithNegativeNumbers() {
        Five9.arr = new int[]{-5, -10, -15};
        int expectedSum = -30;
        int actualSum = Five9.sum();
        assertEquals(expectedSum, actualSum, "Sum of negative numbers should be -30");
    }

    @Test
    void testSumWithMixedNumbers() {
        Five9.arr = new int[]{10, -5, 20, -10};
        int expectedSum = 15;
        int actualSum = Five9.sum();
        assertEquals(expectedSum, actualSum, "Sum of mixed positive/negative should be 15");
    }

    @Test
    void testSumWithSingleElement() {
        Five9.arr = new int[]{42};
        int expectedSum = 42;
        int actualSum = Five9.sum();
        assertEquals(expectedSum, actualSum, "Sum of single element should be 42");
    }

    @Test
    void testSumWithEmptyArray() {
        Five9.arr = new int[]{};
        int expectedSum = 0;
        int actualSum = Five9.sum();
        assertEquals(expectedSum, actualSum, "Sum of empty array should be 0");
    }

    @Test
    void testSumWithZeros() {
        Five9.arr = new int[]{0, 0, 0, 0};
        int expectedSum = 0;
        int actualSum = Five9.sum();
        assertEquals(expectedSum, actualSum, "Sum of all zeros should be 0");
    }

    @Test
    void testSumWithLargeNumbers() {
        Five9.arr = new int[]{1000000, 2000000, 3000000};
        int expectedSum = 6000000;
        int actualSum = Five9.sum();
        assertEquals(expectedSum, actualSum, "Sum of large numbers should be 6000000");
    }

    @Test
    void testSumMultipleCalls() {
        // Verify that calling sum() multiple times returns consistent results
        int firstCall = Five9.sum();
        int secondCall = Five9.sum();
        int thirdCall = Five9.sum();

        assertEquals(firstCall, secondCall, "Multiple calls should return same result");
        assertEquals(secondCall, thirdCall, "Multiple calls should return same result");
    }
}
