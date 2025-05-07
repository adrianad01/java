package com.adrian.roadmap.collections.excercises;

import java.util.Set;
import java.util.TreeSet;

public class Ejercicio6 {
    public static void main(String[] args) {

        Set<Integer> numeros = new TreeSet<>();

        numeros.add(3);
        numeros.add(1);
        numeros.add(2);
        numeros.add(1); // duplicado

        System.out.println("Números: " + numeros);

        numeros.add(4);
        numeros.add(2);
        numeros.add(4);
        numeros.add(4);
        numeros.add(2);
        numeros.add(3);
        numeros.add(1);
        numeros.add(7);
        numeros.add(8);

        System.out.println(numeros);

        for(Integer numero : numeros){
            System.out.println(numero);
        }
    }
}
