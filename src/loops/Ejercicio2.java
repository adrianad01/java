package loops;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa tu edad: ");
        int edad = sc.nextInt();

        for(int years = 1; years <= edad; years++){
            System.out.println("Edad durante el tiempo: " + years);
        }
    }
}
