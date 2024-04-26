//Pedir al usuario que ingrese una cadena de texto y contar cuántas veces aparece la letra 'a' en la cadena usando un bucle for.
package EjerciciosSentencias;

import java.util.Scanner;

public class EjercicioTrece {
    public static void main(String... args) {

        Scanner entrada = new Scanner(System.in);

        String cadena;
        System.out.println("Ingrese una cadena en pantalla: ");
        cadena = entrada.next();

        int conteo = 0;
        for (int i = 0; i < cadena.length(); i++ ){
            if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'A') {
                conteo++;
            }
        }
        System.out.println("La letra 'a' aparece " + conteo + " veces en la cadena.");
        entrada.close();
    }
}
