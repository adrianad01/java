package tiposDatos;

public class primitivosFloat {

    static float varFlotante = 15.45f;

    public static void main(String[] args) {
        
        float realFloat = 1.5e-10f; //2120f;
        System.out.println("realFloat = " + realFloat);
        System.out.println("El float corresponde en byte a " + Float.BYTES);
        System.out.println("El float corresponde en bites a: " + Float.SIZE);
        System.out.println("El valor máximo para float es: " + Float.MAX_VALUE);
        System.out.println("El valor mínimo para float es: "+ Float.MIN_VALUE);
        System.out.println("\n");

        double realDoble = 3.4028235E38;
        System.out.println("realDoble = " + realDoble);
        System.out.println("El double corresponde en byte a " + Double.BYTES);
        System.out.println("El double corresponde en bites a: " + Double.SIZE);
        System.out.println("El valor máximo para double es: " + Double.MAX_VALUE);
        System.out.println("El valor mínimo para double es: "+ Double.MIN_VALUE);
        System.out.println("\n");

        //float varFlotante
        System.out.println("varFlotante = " + varFlotante);
    }
}
