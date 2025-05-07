package com.adrian.legacy.conditionals;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el tipo de ingrediente para tu pizza, puede ser vegetariana o no vegetariana: ");
        String tipoPizza = sc.nextLine().toLowerCase();
        String ingredienteExtra = "";
        switch (tipoPizza){
            case "vegetariana" -> {
                System.out.println("Ingredientes disponibles: Pimiento y Tofu");
                System.out.println("Ingresa el ingrediente extra para tu pizza vegetariana: ");
                ingredienteExtra = sc.nextLine();
            }
            case "no vegetariana" -> {
                System.out.println("Ingredientes disponibles: Peperoni, Jamón y Salmón");
                System.out.println("Ingresa el ingrediente extra para tu pizza no vegetariana: ");
                ingredienteExtra = sc.nextLine();
            }
        }
        System.out.println("El tipo de pizza seleccionado fue: " + tipoPizza + " " +
                "y el ingrediente seleccionado fue " + ingredienteExtra);
    }
}
