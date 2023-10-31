//Calcular el factorial de un número ingresado por el usuario usando un bucle while.
package EjerciciosSentencias;

import java.util.Scanner;

public class EjercicioOnce {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero;

        System.out.println("Ingrese un número en pantalla: ");
        numero = input.nextInt();

        long factorial = 1;

        if (numero < 0) {
            System.out.println("No se puede calcular el factorial de un número negativo.");
        } else if (numero == 0) {
            System.out.println("El factorial de 0 es 1.");
        } else {
            int i = 1;
            while (i <= numero) {
                factorial *= i;
                i++;
            }

            System.out.println("El factorial es: " + factorial);
        }

        input.close();
    }
}

