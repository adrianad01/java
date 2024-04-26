package tiposDatos;

import javax.swing.*;

public class sistemasNumericos {
    public static void main(String[] args) {

        //NUMEROS DECIMALES A BINARIO
        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un número entero");
        int numeroDecimal = 0;
        try {
            numeroDecimal = Integer.parseInt(numeroStr);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error, debe ingresar un número entero");
            main(args);
            System.exit(0);
        }


        System.out.println("numeroDecimal = " + numeroDecimal);
        //Convierte números decimales en números binarios
        String mensajeBinario="número binario de: " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(mensajeBinario);
        
        //NUMEROS BINARIOS A DECIMALES
        int numeroBinario = 0b111110100;
        System.out.println("numeroBinario = " + numeroBinario);
        
        //NUMEROS DECIMALES A OCTALES
        String mensajeOctal = "número octal de " + numeroDecimal + " = " +Integer.toOctalString(numeroDecimal);
        System.out.println(mensajeOctal);

        //NUMEROS OCTALES A DECIMAL
        int numeroOctal = 0764; //Se antepone un "0" antes del número para que el código lo tome como octal
        System.out.println("numeroOctal = " + numeroOctal);

        //NUMEROS DECIMALES A HEXADECIMALES
        String mensajeHexadecimal = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(mensajeHexadecimal);

        int numeroHex = 0x1f4; //Se antepone el "0x" antes del número hexadecimal para que pueda hacer la conversión
        System.out.println("numeroHex = " + numeroHex);


        //De la siguiente manera mostramos todas las conversiones en un JOptionPane
        //De esta manera podemos concatenar varios valores en un mismo string
        String mensaje = mensajeBinario;
        mensaje  += "\n" + mensajeOctal;
        mensaje += "\n" + mensajeHexadecimal;
        JOptionPane.showMessageDialog(null, mensaje);




    }
}
