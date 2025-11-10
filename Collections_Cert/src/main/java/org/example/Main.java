package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;



public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Collection<String> names = new ArrayList<>();
        System.out.println(names.add("John"));
        System.out.println(names.add("Paul"));
        System.out.println(names);

    }
}
