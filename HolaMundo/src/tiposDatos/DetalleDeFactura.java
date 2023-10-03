package tiposDatos;

import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nombreFactura;
        double precio1, precio2, impuesto, totalSiImpuestos, totalNoImpuestos;
        double valorImpuesto = 0.19;


        System.out.println("Ingrese en pantalla el nombre de la factura: ");
        nombreFactura = input.nextLine();

        System.out.println("Ingrese el primer precio: ");
        precio1 = input.nextDouble();

        System.out.println("Ingrese el segundo precio: ");
        precio2 = input.nextDouble();


        totalNoImpuestos = (precio1 + precio2);
        totalSiImpuestos = (precio1 + precio2) + ((precio1 + precio2)*valorImpuesto);
        impuesto = totalNoImpuestos * valorImpuesto;

        String detalleFactura = "La factura "+nombreFactura+ " tiene un total bruto de: "+totalNoImpuestos+" con un impuesto de "+impuesto+ " y el monto total despúes de impuestos de "+totalSiImpuestos;
        System.out.println(detalleFactura);

    }
}
