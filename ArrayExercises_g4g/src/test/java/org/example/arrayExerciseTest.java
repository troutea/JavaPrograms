package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class arrayExerciseTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @Test
    void testSum_withDefaultArray() {
        // Test with the default array {1,2,3,4,5,6}
        int expectedSum = 21; // 1+2+3+4+5+6 = 21
        int actualSum = arrayExercise.sum();
        assertEquals(expectedSum, actualSum, "Sum of {1,2,3,4,5,6} should be 21");
    }

    @Test
    void testSum_withSingleElement() {
        // Test with array containing single element
        arrayExercise.arr = new int[]{5};
        int expectedSum = 5;
        int actualSum = arrayExercise.sum();
        assertEquals(expectedSum, actualSum, "Sum of {5} should be 5");
    }

    @Test
    void testSum_withEmptyArray() {
        // Test with empty array
        arrayExercise.arr = new int[]{};
        int expectedSum = 0;
        int actualSum = arrayExercise.sum();
        assertEquals(expectedSum, actualSum, "Sum of empty array should be 0");
    }

    @Test
    void testSum_withNegativeNumbers() {
        // Test with negative numbers
        arrayExercise.arr = new int[]{-1, -2, -3, -4, -5};
        int expectedSum = -15;
        int actualSum = arrayExercise.sum();
        assertEquals(expectedSum, actualSum, "Sum of negative numbers should be calculated correctly");
    }

    @Test
    void testSum_withMixedPositiveAndNegative() {
        // Test with mixed positive and negative numbers
        arrayExercise.arr = new int[]{10, -5, 3, -2, 4};
        int expectedSum = 10; // 10-5+3-2+4 = 10
        int actualSum = arrayExercise.sum();
        assertEquals(expectedSum, actualSum, "Sum of mixed positive and negative numbers should be 10");
    }

    @Test
    void testSum_withZeros() {
        // Test with array containing zeros
        arrayExercise.arr = new int[]{0, 0, 0, 0};
        int expectedSum = 0;
        int actualSum = arrayExercise.sum();
        assertEquals(expectedSum, actualSum, "Sum of all zeros should be 0");
    }

    @Test
    void testSum_withLargeNumbers() {
        // Test with large numbers
        arrayExercise.arr = new int[]{1000, 2000, 3000};
        int expectedSum = 6000;
        int actualSum = arrayExercise.sum();
        assertEquals(expectedSum, actualSum, "Sum of large numbers should be calculated correctly");
    }

    @Test
    void testSum_withMaxIntValues() {
        // Test edge case with maximum integer values (be careful of overflow)
        arrayExercise.arr = new int[]{Integer.MAX_VALUE};
        int expectedSum = Integer.MAX_VALUE;
        int actualSum = arrayExercise.sum();
        assertEquals(expectedSum, actualSum, "Sum should handle MAX_VALUE");
    }

    @Test
    void testSum_multipleInvocations() {
        // Test that multiple calls return consistent results
        arrayExercise.arr = new int[]{1, 2, 3};
        int firstCall = arrayExercise.sum();
        int secondCall = arrayExercise.sum();
        assertEquals(firstCall, secondCall, "Multiple invocations should return the same result");
    }

    @Test
    void testSum_afterArrayModification() {
        // Test that sum reflects array changes
        arrayExercise.arr = new int[]{1, 2, 3};
        int initialSum = arrayExercise.sum();
        assertEquals(6, initialSum, "Initial sum should be 6");

        arrayExercise.arr = new int[]{4, 5, 6};
        int modifiedSum = arrayExercise.sum();
        assertEquals(15, modifiedSum, "Sum should reflect array modification");
    }
}
