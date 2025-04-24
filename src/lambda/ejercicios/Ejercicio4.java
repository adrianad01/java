package lambda.ejercicios;

// TODO: Crear un Comparator<String> que compare dos cadenas y determine cuál va primero alfabéticamente.

import java.util.Comparator;

public class Ejercicio4 {
    public static void main(String[] args) {

        Comparator<String> compare = Comparator.naturalOrder();

        int resultado = compare.compare("Jose", "Miguel");

        if (resultado < 0) {
            System.out.println("Jose va antes que Miguel");
        } else if (resultado > 0) {
            System.out.println("Miguel va antes que Jose");
        } else {
            System.out.println("Son iguales");
        }

    }
}
