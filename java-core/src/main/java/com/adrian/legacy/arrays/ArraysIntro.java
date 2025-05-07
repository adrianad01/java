package com.adrian.legacy.arrays;

import java.util.Arrays;

/**
 * @returns the arrays structure
 */
public class ArraysIntro {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int number : numbers) {
            System.out.println(number);
        }

        String[] names = {"Adrian", "Danna", "Candy", "Bella"};
        for (String name : names) {
            System.out.println(name);
        }


        int[] numeros = {5, 2, 8, 1, 3};

        // Imprimir arreglo
        System.out.println(Arrays.toString(numeros)); // [5, 2, 8, 1, 3]

        // Ordenar
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros)); // [1, 2, 3, 5, 8]

        // Buscar
        int posicion = Arrays.binarySearch(numeros, 5);
        System.out.println("El número 5 está en la posición: " + posicion);

        // Copiar
        int[] copia = Arrays.copyOf(numeros, 7);
        System.out.println(Arrays.toString(copia)); // [1, 2, 3, 5, 8, 0, 0]

        // Rellenar
        Arrays.fill(copia, 9);
        System.out.println(Arrays.toString(copia)); // [9, 9, 9, 9, 9, 9, 9]

        // Arreglo bidimensional
        int[][] matriz = {{1,2}, {3,4}};
        System.out.println(Arrays.deepToString(matriz)); // [[1, 2], [3, 4]]
    }
}
