package PracticaCondicionales;

import java.util.Scanner;

public class numerosPositivos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un número: ");
        numero = input.nextInt();

        if (numero < 0){
            System.out.println("El número es negativo.");
        } else if (numero > 0){
            System.out.println("El número es positivo.");
        } else {
            System.out.println("El número es 0.");
        }
    }
}
