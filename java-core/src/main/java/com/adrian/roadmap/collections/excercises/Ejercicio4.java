package com.adrian.roadmap.collections.excercises;

import java.util.LinkedList;
import java.util.Queue;

public class Ejercicio4 {
    public static void main(String[] args) {
        Queue<String> cola = new LinkedList<>();

        cola.add("Cliente 1");
        cola.add("Cliente 2");

        System.out.println("Atendiendo: " + cola.poll()); // quita al primero
        System.out.println("Siguiente en fila: " + cola.peek()); // mira sin quitar

        cola.add("Cliente 3");
        cola.add("Cliente 4");
        cola.add("Cliente 5");
        cola.add("Cliente 6");

        try {
            while (!cola.isEmpty()) {
                Thread.sleep(1000);
                System.out.println("Atendiendo a la persona: " + cola.poll());
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
