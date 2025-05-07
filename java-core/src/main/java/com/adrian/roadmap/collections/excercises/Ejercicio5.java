package com.adrian.roadmap.collections.excercises;

import java.util.Stack;

public class Ejercicio5 {
    public static void main(String[] args) {

        Stack<String> tareas = new Stack<>();

        tareas.push("Lavar platos");
        tareas.push("Hacer tarea");

        System.out.println("Última tarea: " + tareas.peek()); // Ver sin sacar
        System.out.println("Completando: " + tareas.pop());   // Saca la última

        tareas.push("Hacer tarea");
        tareas.push("Lavar platos");
        tareas.push("Programar");
        tareas.push("Estudiar");
        tareas.push("Ver al cruz azul");

        while (!tareas.isEmpty()) {
            System.out.println("Siguiente tarea: " + tareas.peek());
            System.out.println("Tarea: " + tareas.pop() + " completada");
        }
    }
}
