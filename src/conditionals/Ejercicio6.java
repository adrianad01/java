package conditionals;

/*
* Los alumnos de un curso se han dividido en dos grupos A y B de acuerdo al sexo y el nombre.
* El grupo A esta formado por las mujeres con un nombre anterior a la M y los hombres con un nombre posterior a la N y el grupo B por el resto.
* Escribir un programa que pregunte al usuario su nombre y sexo, y muestre por pantalla el grupo que le corresponde.*/
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa tu nombre");
        String nombre = input.nextLine();

        System.out.println("Ingresa tu genero");
        String genero = input.nextLine();

//        if ((genero.equalsIgnoreCase("femenino") && nombre.substring(0,1).compareToIgnoreCase("M") < 0)) {
//            System.out.println("Grupo A");
//        }
//        else {
//            System.out.println("Grupo B");
//        }
//
//        if ((genero.equalsIgnoreCase("masculino") && nombre.substring(0,1).compareToIgnoreCase("N") > 0)) {
//            System.out.println("Grupo A");
//        }
//        else {
//            System.out.println("Grupo B");
//        }
    }
}
