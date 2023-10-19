/*
* Edades y categorías de competidores:
Crea un programa que solicite al usuario su edad y, con base en esa edad, determine en qué categoría de competidores entra: infantil, juvenil, adulto o veterano. Utiliza una declaración if-else para realizar esta determinación.
*
*/
package EjerciciosSentencias;
import java.util.Scanner;

public class EjercicioCinco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int edad;
        System.out.println("Ingresa tu edad: ");
        edad = input.nextInt();
        if (edad < 12){
            System.out.println("Entras en la categoría infantil");
        } else if (edad >=12 && edad <=18) {
            System.out.println("Entras en la categoría juvenil");
        } else if (edad >=19 && edad <=50) {
            System.out.println("Entras en la categoría adulto");
        } else {
            System.out.println("Entras en la categoría veterano");
        }
        input.close();
    }
}
