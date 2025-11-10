package org.example;

import java.util.ArrayList;
import java.util.List;

public class Fruits {
    private List<String> fruits = new ArrayList<>();

    public void addFruit(String fruit) {
        fruits.add(fruit);
    }

    public List<String> getFruits()
    {
        return fruits;
    }




}
