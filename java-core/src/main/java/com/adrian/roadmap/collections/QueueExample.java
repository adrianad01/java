package com.adrian.roadmap.collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.add("A");
        queue.add("B");
        queue.add("C");
        System.out.println("El primero en la fila es " + queue.peek());
        System.out.println("El primero en la fila sale y es " + queue.poll());
        System.out.println("El primero en la fila es " + queue.peek());

        PriorityQueue<String> pq = new PriorityQueue<>();

        pq.add("3");
        pq.add("1");
        pq.add("5");

        while (!pq.isEmpty()) {
            System.out.println("El orden es: " + pq.poll());
        }
    }
}
