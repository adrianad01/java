/*Determinar el mayor de tres números:
Pide al usuario que ingrese tres números y utiliza una serie de declaraciones if-else
para determinar cuál de los tres números es el más grande.
*/
package EjerciciosSentencias;

import java.util.Scanner;

public class EjercicioTres {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, num3;
        System.out.println("Ingrese el primer número: ");
        num1 = input.nextInt();
        System.out.println("Ingrese el segundo número: ");
        num2 = input.nextInt();
        System.out.println("Ingrese el tercer número: ");
        num3 = input.nextInt();

        if (num1 > num2 && num1 > num3){
            System.out.println("El número mayor es: "+num1);
        } else if (num1 < num2 && num2 > num3) {
            System.out.println("El número mayor es: "+num2);
        } else {
            System.out.println("El número mayor es: "+num3);
        }
    }
}
