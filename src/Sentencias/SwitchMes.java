package Sentencias;

import java.util.Scanner;

public class SwitchMes {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int numeroMes;
        String nombreMes = null;

        System.out.println("Ingrese el número del mes que requiere ver en pantalla: ");
        numeroMes = input.nextInt();
        
        switch (numeroMes){
            case 1:
                nombreMes = "Enero";
                break;
            case 2:
                nombreMes = "Febrero";
                break;
            case 3:
                nombreMes = "Marzo";
                break;
            case 4:
                nombreMes = "Abril";
                break;
            case 5:
                nombreMes = "Mayo";
                break;
            case 6:
                nombreMes = "Junio";
                break;
            case 7:
                nombreMes = "Julio";
                break;
            case 8:
                nombreMes = "Agosto";
                break;
            case 9:
                nombreMes = "Septiembre";
                break;
            case 10:
                nombreMes = "Octubre";
                break;
            case 11:
                nombreMes = "Noviembre";
                break;
            case 12:
                nombreMes = "Diciembre";
                break;
            default:
                System.out.println("No existe ese mes.");
        }
        System.out.println("nombreMes = " + nombreMes);
    }
}
