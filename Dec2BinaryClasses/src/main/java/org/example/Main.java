package org.example;

//import static org.example.Dec2BinaryClasses.decToBinary;
import static org.example.Dec2BinaryClasses.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int n = 17;
        System.out.println("Decimal - " + n);
        System.out.println("Binary = ");
        decToBinary(n);
    }
}
