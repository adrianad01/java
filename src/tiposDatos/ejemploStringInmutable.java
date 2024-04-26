package tiposDatos;

public class ejemploStringInmutable {
    public static void main(String[] args) {
        //2 maneras de concatenar

        //Operador +
        String curso = "Programación Java";
        String profesor = "Andrés Gúzman";

        String resultado = curso.concat(profesor);
        System.out.println("curso = " + curso);
        System.out.println("resultado = " + resultado);
        System.out.println(curso == resultado);

        curso.transform(c -> {
            return c + " con " + profesor;
        });
        System.out.println("curso = " + curso);

        String resultado2 = curso.transform(c -> {
            return c + " con " + profesor;
        });
        System.out.println("resultado2 = " + resultado2);
        
        String resultado3 = resultado.replaceAll("a", "A");
        System.out.println("resultado3 = " + resultado3);
    }
}
