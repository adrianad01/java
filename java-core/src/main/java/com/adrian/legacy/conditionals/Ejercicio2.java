package com.adrian.legacy.conditionals;/*
 *Escribir un programa que almacene la cadena de caracteres "contraseña" en una variable,
 *pregunte al usuario por la contraseña e imprima por pantalla si la contraseña introducida
 *por el usuario coincide con la guardada en la variable sin tener en cuenta mayúsculas y minúsculas.
 */

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = "contraseña";
        String userPasswordIntroduced;

        System.out.println("Introduzca el password: ");
        userPasswordIntroduced = sc.nextLine();

        if(userPasswordIntroduced.equalsIgnoreCase(password)) {
            System.out.println("El password es correcto.");
        }
        else {
            System.out.println("El password es incorrecto.");
        }
    }
}
