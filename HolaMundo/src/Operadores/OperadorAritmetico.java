package Operadores;

import javax.swing.*;

public class OperadorAritmetico {
    public static void main(String[] args) {

        int i = 5, j = 4, suma = i + j;
        System.out.println("suma = " + suma);
        
        int resta = i - j;
        System.out.println("resta = " + resta);
        
        int multi = i * j;
        System.out.println("multiplicación = " + multi);
        
        int div = i / j;
        float div2 = (float) i/j;
        System.out.println("div = " + div);
        System.out.println("div2 = " + div2);

        int resto = i % j;
        System.out.println("resto = " + resto);

        int resto2 = 5 % 9;
        System.out.println("resto2 = " + resto2);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        if (numero % 2 == 0){
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
    }
}
