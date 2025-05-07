package com.adrian.legacy.loops;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa una palabra: ");
        String palabra = sc.nextLine();

        for (int i = 1; i <= 10; i++){
            System.out.println("#" + i + "- " +palabra);
        }
    }
}
