package com.adrian.roadmap.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueExample {

    public static void main(String[] args) {

        Deque<String> deque = new ArrayDeque<>();
        deque.addLast("A");
        deque.addLast("B");
        deque.addLast("C");
        System.out.println("fila " + deque);
        System.out.println(deque.removeFirst());
        System.out.println("fila " + deque);
        System.out.println(deque.removeLast());
        System.out.println("fila " + deque);
    }
}
