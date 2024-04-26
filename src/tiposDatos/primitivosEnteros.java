package tiposDatos;

public class primitivosEnteros {
    public static void main(String[] args) {

        //Tipo de datos Byte
        byte numeroByte = 127;
        //Atajo: Soutv + Tab
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Tipo Byte corresponde en byte a " + Byte.BYTES); //Cantidad de Bytes en Byte
        System.out.println("Tipo Byte corresponde en bites a " + Byte.SIZE); //Cantidad de Bites en Bites
        System.out.println("El valor máximo de un byte es " + Byte.MAX_VALUE); //Valor máximo del tipo de dato Byte
        System.out.println("El valor mínimo de un byte es " + Byte.MIN_VALUE); //Valor mínimo del tipo de dato Byte
        System.out.println("\n");

        //Tipo de datos Short
        short numeroShort = 32767;
        //Atajo: Soutv + Tab
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Tipo Short corresponde en byte a " + Short.BYTES); //Cantidad de Short en bytes
        System.out.println("Tipo Short corresponde en bites a " + Short.SIZE); //Cantidad de Short en bites
        System.out.println("El valor máximo de un Short es " + Short.MAX_VALUE); //Valor máximo del tipo de dato Short
        System.out.println("El valor mínimo de un Short es " + Short.MIN_VALUE); //Valor mínimo del tipo de dato Short
        System.out.println("\n");

        //Tipo de dato int
        int numeroInt = 2147483647;
        //Atajo: Soutv + Tab
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Tipo int corresponde en byte a " + Integer.BYTES); //Cantidad de int en bytes
        System.out.println("Tipo int corresponde en bites a " + Integer.SIZE); //Cantidad de int en bites
        System.out.println("El valor máximo de un int es " + Integer.MAX_VALUE); //Valor máximo del tipo de dato int
        System.out.println("El valor mínimo de un int es " + Integer.MIN_VALUE); //Valor mínimo del tipo de dato int
        System.out.println("\n");

        //Tipo de dato Long
        long numeroLong = 9223372036854775807L; //El tipo Long lleva una L al final
        //Atajo: Soutv + Tab
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Tipo long corresponde en byte a " + Long.BYTES); //Cantidad de long en bytes
        System.out.println("Tipo long corresponde en bites a " + Long.SIZE); //Cantidad de long en bites
        System.out.println("El valor máximo de un long es " + Long.MAX_VALUE); //Valor máximo del tipo de dato long
        System.out.println("El valor mínimo de un long es " + Long.MIN_VALUE); //Valor mínimo del tipo de dato long
        System.out.println("\n");
        
        //Tipo de dato var
        var numeroVar = 127;
        System.out.println("numeroVar = " + numeroVar);
    }
}
