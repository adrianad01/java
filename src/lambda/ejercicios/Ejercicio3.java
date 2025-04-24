package lambda.ejercicios;

// TODO: Crear una Function<String, Integer> que reciba una palabra y retorne su longitud.

import java.util.function.Function;

public class Ejercicio3 {

    public static void main(String[] args) {

        Function<String, Integer> function = String::length;
        System.out.println(function.apply("Hola, quiero probar la longitud de esta palabra"));
    }
}
