package PracticaCondicionales;

import java.util.Scanner;

public class calificaciones {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, c, d, e, f;
        System.out.println("Ingrese la calificación: ");
        a = input.nextInt();
        System.out.println("Ingrese la calificación: ");
        b = input.nextInt();
        System.out.println("Ingrese la calificación: ");
        c = input.nextInt();
        System.out.println("Ingrese la calificación: ");
        d = input.nextInt();
        System.out.println("Ingrese la calificación: ");
        e = input.nextInt();
        System.out.println("Ingrese la calificación: ");
        f = input.nextInt();

        int prom = ((a+b+c+d+e+f) / 6);
        System.out.println("Promedio = " + prom);
    }
}
