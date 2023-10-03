package PracticaCondicionales;

import java.util.Scanner;

public class numeroMayor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2;
        System.out.println("Ingrese un número: ");
        num1 = input.nextInt();
        System.out.println("Ingrese un número: ");
        num2 = input.nextInt();

        if (num1>num2){
            System.out.println("El número mayor es: " +num1);
        } else if (num2 > num1) {
            System.out.println("El número mayor es: " +num2);
        } else {
            System.out.println("Los numeros son iguales.");
        }
    }
}
