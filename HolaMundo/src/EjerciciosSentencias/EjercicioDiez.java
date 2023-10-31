//Pedir al usuario que ingrese un número y luego imprimir todos los números del 1 al número ingresado usando un bucle while.
package EjerciciosSentencias;

import java.util.Scanner;

public class EjercicioDiez {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);

        int num, i = 1;
        System.out.println("Ingrese un número en pantalla: ");
        num = input.nextInt();

        while (i <= num){
            System.out.println(i);
            i++;
        }
    }
}
