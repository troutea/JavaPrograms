package org.example;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


//var names = new ArrayList<String>();


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Collection<String> names = new ArrayList<>();
        System.out.println(names.add("Johm"));
        System.out.println(names.add("Johm"));
        System.out.println(names.remove("Johm"));
        System.out.println(names.remove("Johm"));

        System.out.println(names);

    }
}
