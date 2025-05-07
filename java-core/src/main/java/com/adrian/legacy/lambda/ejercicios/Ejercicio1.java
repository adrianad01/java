package com.adrian.legacy.lambda.ejercicios;
/*
 * EJERCICIO 1:
 * Crea una expresión lambda que reciba un número entero y devuelva el doble del mismo.
 */

import java.util.function.Function;

public class Ejercicio1 {
    public static void main(String[] args) {

        Function<Integer,Integer> fun = x -> x * 2;
        System.out.println(fun.apply(50));
    }
}
