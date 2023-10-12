package Operadores;

import java.util.Scanner;

public class NumeroOrdenado {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1, num2, ordenados;
        System.out.println("Ingrese un número en pantalla: ");
        num1 = input.nextInt();
        System.out.println("Ingrese otro número en pantalla: ");
        num2 = input.nextInt();

        if (num1 > num2){
            System.out.println("El orden de los números es el siguiente: \n"+"1- Número " +num1+"\n" + "2- Número "+num2);
        } else {
            System.out.println("El orden de los números es el siguiente: \n"+"1- Número " +num2+"\n" + "2- Número "+num1);
        }




    }
}
