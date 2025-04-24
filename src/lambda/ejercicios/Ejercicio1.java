package lambda.ejercicios;

import java.util.function.Consumer;

public class Ejercicio1 {

    public static void main(String[] args) {

        // Crear un Consumer<String> que reciba un nombre y muestre:
        // "Hola, <nombre>. ¡Bienvenido a Java!"

        Consumer<String> print = name -> System.out.println("Hola, " + name + " ¡Bienvenido a Java!");
        print.accept("Adrian");

    }
}
