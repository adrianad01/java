package com.adrian.roadmap.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");

        //Obtenemos el iterator
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String juguete = iterator.next();
            System.out.println(juguete);
        }
    }
}
