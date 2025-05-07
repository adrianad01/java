package com.adrian.legacy.conditionals;

import java.util.Scanner;

/*
* Los tramos impositivos para la declaración de la renta en un determinado país son los siguientes:
* Renta	Tipo impositivo
* Menos de 10000€	5%
* Entre 10000€ y 20000€	15%
* Entre 20000€ y 35000€	20%
* Entre 35000€ y 60000€	30%
* Más de 60000€	45%
* Escribir un programa que pregunte al usuario su renta anual y muestre por pantalla el tipo impositivo que le corresponde.
* */
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa tu renta anual");
        int renta = sc.nextInt();

        if (renta <= 9999) {
            System.out.println("Tu renta es el 5%");
        }
        else if (renta >= 10000 && renta < 20000) {
            System.out.println("Tu renta es el 15%");
        }
        else if(renta>=20000 && renta<35000) {
            System.out.println("Tu renta es el 20%");
        }
        else if(renta>=35000 && renta<60000) {
            System.out.println("Tu renta es el 30%");
        }
        else{
            System.out.println("Tu renta es el 45%");
        }
        sc.close();
    }
}
