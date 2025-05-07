package com.adrian.legacy.lambda.ejercicios;

// TODO: Crear un Runnable que imprima en consola:
// "Ejecutando tarea en segundo plano..."

public class Ejercicio5 {
    public static void main(String[] args) {

        Runnable hello = () -> System.out.println("Ejecutando tarea en segundo plano...");
        hello.run();
    }
}
