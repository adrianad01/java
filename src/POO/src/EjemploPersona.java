package POO.src;

public class EjemploPersona {
    public static void main(String... args) {

        Persona datoPersona = new Persona();

        datoPersona.nombre = "Adrian";
        datoPersona.edad = 22;

        System.out.println(datoPersona.detail());

    }
}
