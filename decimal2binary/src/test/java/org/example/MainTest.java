package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private ByteArrayOutputStream outputStream;
    private PrintStream originalOut;

    @BeforeEach
    public void setUp() {
        // Capture System.out to verify printed output
        outputStream = new ByteArrayOutputStream();
        originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void testDecToBinaryZero() {
        Main.decToBinary(0);
        String output = outputStream.toString();
        assertEquals("", output, "Binary representation of 0 should produce no output");
    }
    @Test
    public void testDecToBinaryOne() {
        Main.decToBinary(1);
        String output = outputStream.toString();
        assertEquals("1", output, "Binary representation of 1 should be 1");
    }

    @Test
    public void testDecToBinaryTwo() {
        Main.decToBinary(2);
        String output = outputStream.toString();
        assertEquals("10", output, "Binary representation of 2 should be 10");
    }

    @Test
    public void testDecToBinarySeventeen() {
        Main.decToBinary(17);
        String output = outputStream.toString();
        assertEquals("10001", output, "Binary representation of 17 should be 10001");
    }

    @Test
    public void testDecToBinaryEight() {
        Main.decToBinary(8);
        String output = outputStream.toString();
        assertEquals("1000", output, "Binary representation of 8 should be 1000");
    }

    @Test
    public void testDecToBinaryFifteen() {
        Main.decToBinary(15);
        String output = outputStream.toString();
        assertEquals("1111", output, "Binary representation of 15 should be 1111");
    }

    @Test
    public void testDecToBinaryThirtytwo() {
        Main.decToBinary(32);
        String output = outputStream.toString();
        assertEquals("100000", output, "Binary representation of 32 should be 100000");
    }

    @Test
    public void testDecToBinaryLargeNumber() {
        Main.decToBinary(255);
        String output = outputStream.toString();
        assertEquals("11111111", output, "Binary representation of 255 should be 11111111");
    }

    @Test
    public void testDecToBinaryPowerOfTwo() {
        Main.decToBinary(128);
        String output = outputStream.toString();
        assertEquals("10000000", output, "Binary representation of 128 should be 10000000");
    }

    @Test
    public void testDecToBinaryOddNumber() {
        Main.decToBinary(11);
        String output = outputStream.toString();
        assertEquals("1011", output, "Binary representation of 11 should be 1011");
    }


}
