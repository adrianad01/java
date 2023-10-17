package Sentencias;
import java.util.Scanner;

public class SentenciaSwitchCaseNumDiasMes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int days;

        System.out.println("Ingrese la cantidad de días del año: ");
        days = input.nextInt();

        if (days == 365){
            System.out.println("Es un año natural");
        } else if (days == 366) {
            System.out.println("Es un año bisiesto");
        } else {
            System.out.println("No corresponde a ninguno");
        }
    }
}