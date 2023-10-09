package Operadores;

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        // variable = condicion ? si es verdadero : si es falso;

        String variable = 5 == 7 ? "Verdadero" : "Falso";
        System.out.println("variable = " + variable);

        String estado = "";
        double promedio = 0.0;
        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la nota de matematicas entre 2.0 y 7.0: ");
        matematicas = entrada.nextDouble();
        System.out.println("Ingrese la nota de ciencias entre 2.0 y 7.0: ");
        ciencias = entrada.nextDouble();
        System.out.println("Ingrese la nota de historia entre 2.0 y 7.0: ");
        historia = entrada.nextDouble();

        promedio = (matematicas + ciencias + historia) / 3;
        System.out.println("promedio = " + promedio);


        estado = promedio > 5.49 ? "Aprobado":"Reprobado";
        System.out.println("estado = " + estado);


    }
}
