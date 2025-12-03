package org.example;

import java.util.*;


class Main {


    public static void main(String[] args) {

        System.out.println("Hello world!");
        enum Compass {
            NORTH, SOUTH, EAST, WEST;
        }

        Compass N = Compass.NORTH;
        System.out.println(N == Compass.NORTH);

        for (var direction : Compass.values()) {
            System.out.println(direction.ordinal() + " : " + direction.name());
        }
    }
}
