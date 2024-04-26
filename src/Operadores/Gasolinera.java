package Operadores;
import java.util.Scanner;
public class Gasolinera {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int capacidad;
        System.out.println("Ingrese la cantidad de litros del estanque: ");
        capacidad = input.nextInt();

        if (capacidad == 70){
            System.out.println("Estanque lleno");
        } else if (capacidad >= 60 && capacidad < 70) {
            System.out.println("Estanque casi lleno");
        } else if (capacidad >= 40 && capacidad < 60) {
            System.out.println("Estanque 3/4");
        } else if (capacidad >= 35 && capacidad < 40) {
            System.out.println("Medio Estanque");
        } else if (capacidad >= 20 && capacidad < 35) {
            System.out.println("Suficiente");
        } else{
            System.out.println("Insuficiente");
        }
    }
}
