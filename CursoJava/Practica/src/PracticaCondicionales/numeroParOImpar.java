package PracticaCondicionales;

import java.util.Scanner;

public class numeroParOImpar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;

        System.out.println("Ingrese un número.");
        numero = input.nextInt();

        if (numero % 2 == 0){
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
    }
}
