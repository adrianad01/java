package com.adrian.legacy.loops;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa un numero positivo entero");
        int numero = entrada.nextInt();

        for(int i = 1; i <= numero; i+=2){
            System.out.print(i + ", ");
        }
    }
}
