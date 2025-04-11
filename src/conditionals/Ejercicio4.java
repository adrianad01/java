package conditionals;

import java.util.Scanner;

/*
 Para tributar un determinado impuesto se debe ser mayor de 16 años y tener unos ingresos iguales o superiores a 1000 € mensuales.
 Escribir un programa que pregunte al usuario su edad y sus ingresos mensuales y
 muestre por pantalla si el usuario tiene que tributar o no.
*/
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa tu edad: ");
        int edad = entrada.nextInt();

        System.out.println("Captura tu ingreso mensual");
        float ingreso = entrada.nextFloat();

        if (edad >= 16 && ingreso >= 1000){
            System.out.println("Debes tributar");
        }
    }
}
