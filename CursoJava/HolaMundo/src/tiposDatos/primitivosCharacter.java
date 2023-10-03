package tiposDatos;

public class primitivosCharacter {
    public static void main(String[] args) {

        var caracter = '\u0040';
        char decimal = 64;
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        
        //Se imprime un resultado booleano
        System.out.println("decimal = caracter:  " + (decimal == caracter));
        
        char caracterDos = '@';
        System.out.println("caracterDos = " + caracterDos);
        System.out.println("decimal = caracter:  " + (caracterDos == caracter));

        char espacio = ' ';

        System.out.println("char corresponde en bytes:" + espacio + Character.BYTES);
        System.out.println("char corresponde en bits: " + Character.SIZE);
        System.out.println("Character.MAX_VALUE " + Character.MAX_VALUE);
        System.out.println("Character.MIN_VALUE " + Character.MIN_VALUE);

    }
}
