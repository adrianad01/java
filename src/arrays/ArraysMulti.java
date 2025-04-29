package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysMulti {


    public static void main(String[] args) {

        int contador = 1;
        int filas = 0, columnas = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de filas: ");
        filas = scanner.nextInt();
        System.out.println("Ingresa la cantidad de columnas: ");
        columnas = scanner.nextInt();

        int [][] numbers = new int[filas][columnas];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = contador;
                contador++;
                System.out.print("["+ numbers[i][j] +"]");
            }
            System.out.println(" ");
        }

        System.out.println(Arrays.toString(numbers));
    }
}
