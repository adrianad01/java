//Imprimir la tabla de multiplicar del 5 usando un bucle for.
package EjerciciosSentencias;

public class EjercicioNueve {
    public static void main(String[] args) {
        int numero = 5;

        System.out.println("Tabla de multiplicar del 5:");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}
