package conditionals;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa tu edad: ");
        int edad = sc.nextInt();

        if (edad < 4){
            System.out.println("Entrada gratis");
        }
        else if (edad >= 4 && edad <= 18){
            System.out.println("Pagas 5 euros");
        }
        else {
            System.out.println("Pagas 10 euros");
        }
        sc.close();
    }
}
