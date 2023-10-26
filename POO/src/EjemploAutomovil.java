public class EjemploAutomovil {
    public static void main(String... args) {

        Automovil honda = new Automovil();

        honda.fabricante = "Honda";
        honda.modelo = "Civic";
        honda.color = "Blanco";
        honda.cilindrada = 2.0;

        Automovil mazda = new Automovil();
        mazda.fabricante = "Mazda";
        mazda.modelo = "BT-50";
        mazda.color = "Rojo";
        mazda.cilindrada = 3.0;

        System.out.println(honda.detalle());
        System.out.println(mazda.detalle());

    }
}
