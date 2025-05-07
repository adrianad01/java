package com.adrian.legacy.loops;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int suma = 0;
        System.out.println("Ingresa un número:");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        System.out.println("La suma total es: " + suma);
        sc.close();
    }
}
