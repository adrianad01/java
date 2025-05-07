package com.adrian.roadmap.collections.excercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Ejercicio1 {
    public static void main(String[] args) {

        List<String> listShop = new ArrayList<>();
        listShop.add("Manzana");
        listShop.add("Pan");
        listShop.add("Leche");

        System.out.println("List: " + listShop);
        listShop.remove("Leche");
        System.out.println("List after remove Leche: " + listShop);
        listShop.add("Tomate");
        listShop.add("Galletas");
        listShop.add("Coca");
        System.out.println(listShop);

        //Ordenar una collection alfabéticamente
        Collections.sort(listShop);
        System.out.println("List: " + listShop);

        //Filtrado de un valor de la collection que empiece por la letra M
        System.out.println("Starts with M: " + listShop
                .stream()
                .filter(name -> name.startsWith("M"))
                .toList());
    }
}
