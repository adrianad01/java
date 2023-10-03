package PracticaCondicionales;

import java.util.Scanner;

public class diaSemana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int diaSemana;

        System.out.println("Ingrese el número del dia de la semana siendo:\n1-Lunes\n2-Martes\n3-Miercoles\n4-Jueves\n5-Viernes\n6-Sábado\n7-Domingo\n");
        diaSemana = input.nextInt();

        switch (diaSemana) {
            case 1:
                System.out.println("EL día de la semana es Lunes");
                break;
            case 2:
                System.out.println("EL día de la semana es Martes");
                break;
            case 3:
                System.out.println("EL día de la semana es Miercoles");
                break;
            case 4:
                System.out.println("EL día de la semana es Jueves");
                break;
            case 5:
                System.out.println("EL día de la semana es Viernes");
                break;
            case 6:
                System.out.println("EL día de la semana es Sábado");
                break;
            case 7:
                System.out.println("EL día de la semana es Domingo");
                break;

            default:
                System.out.println("No pertenece a ninguno de estos dias");
                break;
        }
    }
}
