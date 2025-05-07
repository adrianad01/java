package com.adrian.legacy.exceptions;

/*
    EJERCICIO 2 - MANEJO DE ERRORES EN JAVA

    Implementa una clase `Calculadora` con un método `int dividir(int a, int b)`
    que lance una excepción personalizada `DivisionPorCeroException` si el divisor es cero.

    Luego, crea una clase con `main` que use esta calculadora y
    maneje esa excepción con un bloque try-catch.
*/


public class Calculadora {
    public static void main(String[] args) throws DivisionPorCeroException {
        try {
            int resultado = Calculadora.dividir(3, 0);
            System.out.println(resultado);
        }
        catch (DivisionPorCeroException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int dividir(int a, int b) throws DivisionPorCeroException {
        if (b == 0){
            throw new DivisionPorCeroException("No se puede dividir entre 0");
        }
        return a / b;
    }
}
