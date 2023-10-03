package PracticaCondicionales;

import java.util.Scanner;

public class yearBisiesto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int dias;

        System.out.println("Ingrese la cantidad de días en un año");
        dias = input.nextInt();

        if (dias > 365){
            System.out.println("Es año bisiesto");
        } else {
            System.out.println("No es año bisiesto");
        }
    }
}
