package Operadores;
import javax.swing.*;
public class MiembrosFamilia {
    public static void main(String[] args) {

        String nombre1, nombre2, nombre3;

        nombre1 = JOptionPane.showInputDialog("Ingrese el nombre del primer integrante de la familia: ");
        nombre2 = JOptionPane.showInputDialog("Ingrese el nombre del segundo integrante de la familia: ");
        nombre3 = JOptionPane.showInputDialog("Ingrese el nombre del tercer integrante de la familia: ");

        if (nombre1.length() > nombre2.length() && nombre1.length() > nombre3.length()){
            JOptionPane.showMessageDialog(null, nombre1 + " tiene el nombre más largo");
        } else if (nombre1.length() < nombre2.length() && nombre2.length() > nombre3.length()) {
            JOptionPane.showMessageDialog(null, nombre2 + " tiene el nombre más largo");
        } else {
            JOptionPane.showMessageDialog(null, nombre3 + " tiene el nombre más largo");
        }
    }
}
