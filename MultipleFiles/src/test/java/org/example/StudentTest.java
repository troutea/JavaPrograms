package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    @DisplayName("Test Student creation with valid data")
    void testStudentCreation() {
        Student student = new Student(1, "John Doe");

        assertNotNull(student, "Student object should not be null");
        assertEquals(1, student.id, "Student ID should be 1");
        assertEquals("John Doe", student.n, "Student name should be 'John Doe'");
    }

    @Test
    @DisplayName("Test Student with positive ID")
    void testStudentWithPositiveId() {
        Student student = new Student(100, "Alice Smith");

        assertEquals(100, student.id, "Student ID should be 100");
        assertEquals("Alice Smith", student.n, "Student name should be 'Alice Smith'");
    }

    @Test
    @DisplayName("Test Student with zero ID")
    void testStudentWithZeroId() {
        Student student = new Student(0, "Bob Johnson");

        assertEquals(0, student.id, "Student ID should be 0");
        assertEquals("Bob Johnson", student.n, "Student name should be 'Bob Johnson'");
    }

    @Test
    @DisplayName("Test Student with negative ID")
    void testStudentWithNegativeId() {
        Student student = new Student(-1, "Charlie Brown");

        assertEquals(-1, student.id, "Student ID should be -1");
        assertEquals("Charlie Brown", student.n, "Student name should be 'Charlie Brown'");
    }

    @Test
    @DisplayName("Test Student with empty string name")
    void testStudentWithEmptyName() {
        Student student = new Student(5, "");

        assertEquals(5, student.id, "Student ID should be 5");
        assertEquals("", student.n, "Student name should be empty string");
        assertTrue(student.n.isEmpty(), "Student name should be empty");
    }

    @Test
    @DisplayName("Test Student with null name")
    void testStudentWithNullName() {
        Student student = new Student(10, null);

        assertEquals(10, student.id, "Student ID should be 10");
        assertNull(student.n, "Student name should be null");
    }

    @Test
    @DisplayName("Test Student with special characters in name")
    void testStudentWithSpecialCharacters() {
        Student student = new Student(15, "O'Brien-Smith Jr.");

        assertEquals(15, student.id, "Student ID should be 15");
        assertEquals("O'Brien-Smith Jr.", student.n, "Student name should handle special characters");
    }

    @Test
    @DisplayName("Test Student with unicode characters in name")
    void testStudentWithUnicodeCharacters() {
        Student student = new Student(20, "José García");

        assertEquals(20, student.id, "Student ID should be 20");
        assertEquals("José García", student.n, "Student name should handle unicode characters");
    }

    @Test
    @DisplayName("Test Student with very long name")
    void testStudentWithLongName() {
        String longName = "A".repeat(1000);
        Student student = new Student(25, longName);

        assertEquals(25, student.id, "Student ID should be 25");
        assertEquals(longName, student.n, "Student should handle long names");
        assertEquals(1000, student.n.length(), "Name length should be 1000");
    }

    @Test
    @DisplayName("Test Student with single character name")
    void testStudentWithSingleCharacterName() {
        Student student = new Student(30, "X");

        assertEquals(30, student.id, "Student ID should be 30");
        assertEquals("X", student.n, "Student name should be 'X'");
    }

    @Test
    @DisplayName("Test Student with numeric name")
    void testStudentWithNumericName() {
        Student student = new Student(35, "12345");

        assertEquals(35, student.id, "Student ID should be 35");
        assertEquals("12345", student.n, "Student name can contain numbers");
    }

    @Test
    @DisplayName("Test Student with whitespace in name")
    void testStudentWithWhitespaceName() {
        Student student = new Student(40, "   ");

        assertEquals(40, student.id, "Student ID should be 40");
        assertEquals("   ", student.n, "Student name can be whitespace");
    }

    @Test
    @DisplayName("Test multiple Student objects are independent")
    void testMultipleStudentsIndependence() {
        Student student1 = new Student(1, "Alice");
        Student student2 = new Student(2, "Bob");

        assertNotSame(student1, student2, "Students should be different objects");
        assertNotEquals(student1.id, student2.id, "Student IDs should be different");
        assertNotEquals(student1.n, student2.n, "Student names should be different");
    }

    @Test
    @DisplayName("Test Student fields are mutable")
    void testStudentFieldsMutable() {
        Student student = new Student(1, "Original Name");

        // Modify fields directly (since they're public)
        student.id = 999;
        student.n = "Modified Name";

        assertEquals(999, student.id, "Student ID should be modifiable");
        assertEquals("Modified Name", student.n, "Student name should be modifiable");
    }

    @Test
    @DisplayName("Test Student with maximum integer ID")
    void testStudentWithMaxIntId() {
        Student student = new Student(Integer.MAX_VALUE, "Max ID Student");

        assertEquals(Integer.MAX_VALUE, student.id, "Student ID should be Integer.MAX_VALUE");
        assertEquals("Max ID Student", student.n, "Student name should be 'Max ID Student'");
    }

    @Test
    @DisplayName("Test Student with minimum integer ID")
    void testStudentWithMinIntId() {
        Student student = new Student(Integer.MIN_VALUE, "Min ID Student");

        assertEquals(Integer.MIN_VALUE, student.id, "Student ID should be Integer.MIN_VALUE");
        assertEquals("Min ID Student", student.n, "Student name should be 'Min ID Student'");
    }
}
