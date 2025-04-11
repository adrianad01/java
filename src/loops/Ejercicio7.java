package loops;

/*
Ejercicio 7: Tabla de multiplicar
Enunciado:
Pide un número al usuario y muestra su tabla de multiplicar del 1 al 10.

Detalles:
- Usa Scanner para pedir el número.
- Usa un for para multiplicar el número por los valores del 1 al 10.
- Imprime cada resultado en una línea, por ejemplo:
    5 x 1 = 5
    5 x 2 = 10
    ...
    5 x 10 = 50
*/

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int multiplicador = 0;
        System.out.println("Ingresa un numero entre 1 y 10");
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            multiplicador = num * i;
            System.out.println(num + "*" + i + " = " + multiplicador);
        }
        sc.close();

    }
}
