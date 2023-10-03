package tiposDatos;

public class tiposDatos {
    public static void main(String[] args) {

        String saludo = "Hola Mundo desde Java";
        System.out.println(saludo);
        //Convierte el String en Mayúsculas
        System.out.println("saludo.toUpperCase() = " + saludo.toUpperCase());

        int numero = 10;
        System.out.println(numero);

        boolean valor = true;
        if (valor){
            System.out.println("Es verdadero");
        }

        var numero2 = 15;

        String nombre;
        nombre = "Adrián";
        System.out.println("nombre = " + nombre);

    }
}
