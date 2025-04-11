package conditionals;

import java.util.Scanner;

/*
 * Escribir un programa que pida al usuario un número entero y muestre por pantalla si es par o impar.
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int numero = entrada.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El numero es par");
        }
        else {
            System.out.println("El numero es impar");
        }
    }
}
