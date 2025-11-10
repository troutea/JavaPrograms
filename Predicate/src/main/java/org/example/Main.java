package org.example;

import java.util.function.*;

import java.time.*;



public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
         Consumer<String> greet = s -> System.out.println(("Hello, " + s + "!"));
        //Supplier<LocalDateTime> dtImpl = () -> LocalDateTime.now();
        greet.accept("Anthony Trout");

    }
}
