/**
 * Cajero automático:
 * Crea un programa simulado de un cajero automático que permita al usuario retirar dinero, consultar saldo y depositar dinero.
 * Utiliza una declaración switch para gestionar las diferentes opciones del menú.
 */
package EjerciciosSentencias;

import java.util.Scanner;

public class EjercicioCuatro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int saldoInicial, saldoFinal, saldoRetirar, depositarDinero;
        String Option, retirarDinero;

        System.out.println("Ingresa el monto de tu saldo Inicial: ");
        saldoInicial = input.nextInt();

        System.out.println("Selecciona la opción que deseas consultar: Retirar, Consulta o Depositar");
        Option = input.next();

        switch (Option.toLowerCase()){
            case "retirar":
                System.out.println("Ingresa la cantidad que deseas retirar: ");
                saldoRetirar = input.nextInt();
                saldoFinal = saldoInicial - saldoRetirar;
                String error = saldoRetirar > saldoInicial ? "Operacion no validada, no puedes retirar más dinero de lo que tienes en tu cuenta." : "Retiraste $"+saldoRetirar+" y tu saldo final es: $"+saldoFinal;
                System.out.println(error);
                break;
            case "consulta":
                System.out.println("Tu saldo es: $" +saldoInicial);
                break;
            case "depositar":
                System.out.println("Ingrese la cantidad que deseas depositar");
                depositarDinero = input.nextInt();
                saldoFinal = saldoInicial + depositarDinero;
                System.out.println("Depositaste $"+depositarDinero+" y tu saldo final es: $"+saldoFinal);
                break;
            default:
                System.out.println("No corresponde a las opciones.");

        }

    }
}
