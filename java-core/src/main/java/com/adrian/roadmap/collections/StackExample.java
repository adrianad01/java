package com.adrian.roadmap.collections;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");

        //Ver el ultimo elemento sin quitarlo
        System.out.println(stack.peek());

        //Quitar el ultimo elemento
        System.out.println(stack.pop());

        //Ver el nuevo tope de elementos
        System.out.println(stack.peek());

        //is Empty?
        System.out.println(stack.isEmpty());
    }
}
