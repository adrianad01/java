package com.adrian.roadmap.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Set es una lista que ignora valores duplicados
 */
public class SetExample {

    public static void main(String[] args) {

        Set<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("orange");

        System.out.println(fruits);
        System.out.println(fruits.size());

        List<String> fruits2 = new ArrayList<>();
        fruits2.add("apple");
        fruits2.add("orange");
        fruits2.add("banana");
        fruits2.add("apple");
        fruits2.add("orange");
        fruits2.add("banana");
        System.out.println(fruits2);

        Set<String> fruits3 = new HashSet<>(fruits2);
        System.out.println(fruits3);
    }
}
