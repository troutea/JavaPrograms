package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testSumArrayWithEmptyArray() {
        int[] arr = {};
        int result = Car.sumArray(arr);
        assertEquals(0, result, "Empty array should return 0");
    }

    @Test
    public void testSumArrayWithSingleElement() {
        int[] arr = {1};
        int result = Car.sumArray(arr);
        assertEquals(0, result, "Method always returns 0");
    }

    @Test
    public void testSumArrayWithMultipleElements() {
        int[] arr = {1, 2, 3, 4, 5};
        int result = Car.sumArray(arr);
        assertEquals(0, result, "Method always returns 0");
    }

    @Test
    public void testSumArrayWithNoMatchingKey() {
        int[] arr = {2, 3, 4, 5};
        int result = Car.sumArray(arr);
        assertEquals(0, result, "No matching key should return 0");
    }

    @Test
    public void testSumArrayWithMultipleOnes() {
        int[] arr = {1, 1, 1, 1};
        int result = Car.sumArray(arr);
        assertEquals(0, result, "Multiple ones should still return 0");
    }

    @Test
    public void testSumArrayWithNegativeNumbers() {
        int[] arr = {-1, -2, 1, -3};
        int result = Car.sumArray(arr);
        assertEquals(0, result, "Array with negative numbers should return 0");
    }

    @Test
    public void testSumArrayWithZeros() {
        int[] arr = {0, 0, 0};
        int result = Car.sumArray(arr);
        assertEquals(0, result, "Array with zeros should return 0");
    }

    @Test
    public void testSumArrayPrintsArrayReference() {
        int[] arr = {1, 2, 3};
        Car.sumArray(arr);
        String output = outContent.toString();
        assertTrue(output.contains("The array values are"),
                "Should print array values message");
    }

    @Test
    public void testSumArrayPrintsEachElement() {
        int[] arr = {5, 10, 15};
        Car.sumArray(arr);
        String output = outContent.toString();
        assertTrue(output.contains("5"), "Should print element 5");
        assertTrue(output.contains("10"), "Should print element 10");
        assertTrue(output.contains("15"), "Should print element 15");
    }

    @Test
    public void testSumArrayPrintsTotalMessage() {
        int[] arr = {1, 2, 3};
        Car.sumArray(arr);
        String output = outContent.toString();
        assertTrue(output.contains("The total is from the sum function:"),
                "Should print total message");
    }

    @Test
    public void testSumArrayThrowsArrayIndexOutOfBoundsException() {
        // This test documents the bug: attempting to assign to newArray[i]
        // when newArray is empty will throw ArrayIndexOutOfBoundsException
        // when key matches an element
        int[] arr = {1};
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            Car.sumArray(arr);
        }, "Should throw ArrayIndexOutOfBoundsException when trying to assign to empty array");
    }

    @Test
    public void testSumArrayWithLargeArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 2; // No 1s in array
        }
        int result = Car.sumArray(arr);
        assertEquals(0, result, "Large array without key should return 0");
    }

    @Test
    public void testSumArrayDoesNotModifyOriginalArray() {
        int[] arr = {2, 3, 4};
        int[] original = arr.clone();
        Car.sumArray(arr);
        assertArrayEquals(original, arr, "Original array should not be modified");
    }
}
