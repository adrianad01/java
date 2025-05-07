package com.adrian.legacy.loops;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un numero entero positivo: ");
        int numero = sc.nextInt();

        for(int i = numero; i >= 0; i--){
            System.out.print(i + ", ");
        }
    }
}
