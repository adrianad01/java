package com.adrian.roadmap.collections.excercises;

import java.util.HashSet;
import java.util.Set;

public class Ejercicio2 {

    public static void main(String[] args) {
        Set<String> colores = new HashSet<>();

        colores.add("Rojo");
        colores.add("Azul");
        colores.add("Rojo"); // duplicado

        System.out.println("Colores: " + colores);

        colores.add("Azul");
        colores.add("Rojo");
        colores.add("Naranja");
        colores.add("Rosa");
        colores.add("Negro");
        System.out.println("Colores unicos: " + colores.size());
        System.out.println("Colores verdes: " + colores.contains("Verde"));
    }
}
