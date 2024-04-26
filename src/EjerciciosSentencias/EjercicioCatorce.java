//Imprimir los primeros 15 términos de la serie de Fibonacci usando un bucle for.
package EjerciciosSentencias;

public class EjercicioCatorce {
    public static void main(String[] args) {

        int n = 15; // Número de términos que deseas imprimir

        int[] fibonacciSeries = new int[n];
        fibonacciSeries[0] = 0; // El primer término
        fibonacciSeries[1] = 1; // El segundo término

        for (int i = 2; i < n; i++) {
            // Calcula el término actual sumando los dos términos anteriores
            fibonacciSeries[i] = fibonacciSeries[i - 1] + fibonacciSeries[i - 2];
        }

        // Imprime la serie de Fibonacci
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciSeries[i] + " ");
        }
    }
}
