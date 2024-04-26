package tiposDatos;

public class ejemploStringConcatenacion {
    public static void main(String[] args) {
        //2 maneras de concatenar

        //Operador +
        String curso = "Programación Java";
        String profesor = "Andrés Gúzman";
        String detalle = curso + "con el instructor: " + profesor;

        //El método .concat es similar a utilizar el símbolo +
        String detalle2 = curso.concat(" con el profesor ".concat(profesor));
        System.out.println("detalle2 = " + detalle2);

        int a = 10;
        int b = 5;
        System.out.println(detalle + (a + b)); //Primero va a leer lo que se encuentra entre paréntesis y después el String
        System.out.println(a + b + detalle); //Lee el código de izquierda a derecha



    }
}
