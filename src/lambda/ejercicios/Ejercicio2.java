package lambda.ejercicios;

import java.util.function.Predicate;

public class Ejercicio2 {
    public static void main(String[] args) {

        // Crear un Predicate<Integer> que reciba un número y retorne true si es par, false si es impar.

        Predicate<Integer> parOrNot = number -> number % 2 == 0;
        System.out.println(parOrNot.test(5));
        System.out.println(parOrNot.test(6));
    }
}
