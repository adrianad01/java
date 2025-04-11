package conditionals;

/*Escribir un programa que pida al usuario dos números y
muestre por pantalla su división.
Si el divisor es cero el programa debe mostrar un error.*/

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        int numero1 = entrada.nextInt();
        System.out.println("Ingrese un numero entero: ");
        int numero2 = entrada.nextInt();

        if(numero2 == 0) {
            System.out.println("ERROR");
        }
        else {
            int resultado = numero1 / numero2;
            System.out.println("El resultado es " + resultado);
        }
    }
}
