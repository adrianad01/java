package com.adrian.roadmap.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        List<String> names = Arrays.asList("Adrian", "Miguel");
        System.out.println(names.get(1));
        System.out.println(names);
        System.out.println(names.stream().filter(name -> name.equals("Adrian")).findFirst().get());
        System.out.println(names.isEmpty());

        System.out.println("----------------");

        System.out.println("Recorriendo la lista");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
