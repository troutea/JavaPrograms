package org.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        //try-with-resources: FileInputStream will be closed automatically
        Stream<String> myStream = Stream.of("L", "u", "k", "e");
        String myName = myStream.reduce("", String::concat);
        System.out.println(myName);

        Stream<Integer> stream = Stream.of(3,7,10);
        System.out.println(stream.reduce(1, (a,b) -> a*b));

    }
}
