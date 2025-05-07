package com.adrian.legacy.lambda.ejercicios;

import java.util.function.Consumer;

/*
 * EJERCICIO 2:
 * Usa una expresión lambda con la interfaz Consumer<String> para imprimir en consola
 * el mensaje "Hola, <nombre>" donde <nombre> es el valor recibido.
 */
public class Ejercicio2 {
    public static void main(String[] args) {

        Consumer<String> print = name -> System.out.println("Hola, " + name);
        print.accept("Adrian");

    }
}
