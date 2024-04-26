/*
 * Calculadora Simple: Crea una calculadora simple que pueda realizar operaciones básicas como suma, resta, multiplicación y división.
 * Utiliza un switch para permitir al usuario seleccionar la operación que desean realizar.
 */
package EjerciciosSentencias;

import java.util.Scanner;

public class EjercicioUno {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1, num2, suma, resta, mult, div;

        System.out.println("Ingrese el primer número en pantalla: ");
        num1 = input.nextInt();
        System.out.println("Ingrese el segundo número en pantalla: ");
        num2 = input.nextInt();

        System.out.println("Seleccione el tipo de operación que desea realizar: suma, resta, multiplicación o división");
        String operacion = input.next();

        switch (operacion.toLowerCase()) {
            case "suma":
                suma = num1 + num2;
                System.out.println("suma = " + suma);
                break;
            case "resta":
                resta = num1 - num2;
                System.out.println("resta = " + resta);
                break;
            case "multiplicación":
                mult = num1 * num2;
                System.out.println("multiplicación = " + mult);
                break;
            case "división":
                div = num1 / num2;
                System.out.println("división = " + div);
                break;
            default:
                System.out.println("No corresponde a ninguna operación");
        }

    }
}
