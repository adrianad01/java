/*
Día de la semana:
Pide al usuario que ingrese un número del 1 al 7, que represente un día de la semana.
Luego, muestra el nombre del día correspondiente utilizando una declaración switch.
package EjerciciosSentencias;
*/
package EjerciciosSentencias;

import java.util.Scanner;

public class EjercicioDos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int diaSem;
        System.out.println("Ingrese el número del día de la semana: ");
        diaSem = input.nextInt();

        switch (diaSem){
            case 1:
                System.out.println("El día de la semana es Lunes.");
                break;
            case 2:
                System.out.println("El día de la semana es Martes.");
                break;
            case 3:
                System.out.println("El día de la semana es Miercoles.");
                break;
            case 4:
                System.out.println("El día de la semana es Jueves.");
                break;
            case 5:
                System.out.println("El día de la semana es Viernes.");
                break;
            case 6:
                System.out.println("El día de la semana es Sábado.");
                break;
            case 7:
                System.out.println("El día de la semana es Domingo.");
                break;
            default:
                System.out.println("No corresponde a ningún día.");
        }
    }
}

