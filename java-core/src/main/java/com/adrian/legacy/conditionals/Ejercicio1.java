package com.adrian.legacy.conditionals;/*
 * Escribir un programa que pregunte al usuario su edad y muestre por pantalla si es mayor de edad o no.
 */

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        int edad;
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        edad = input.nextInt();

        if (edad < 18) {
            System.out.println("Eres menor de edad");
        }
        else{
            System.out.println("Eres mayor de edad");
        }
    }

}
