package Operadores;

public class OperadoresLogicos {
    public static void main(String[] args) {
        
        int i = 3;
        byte j = 7;
        float k = 127e-7f;
        double l = 2.1413e3;
        boolean m = false;

        //And &&: Todas las condiciones se deben de cumplir
        boolean b1 = i == j && k < l && m == false;
        System.out.println("b1 = " + b1);

        //Or ||: Con que se cumpla una condición, la expresión es verdadera.
        boolean b2 = i == j || k > l;
        System.out.println("b2 = " + b2);

        boolean b3 = i == j && k > l || m == false;
        System.out.println("b3 = " + b3);
        
        boolean b4 = i == j || k < l && m == true;
        System.out.println("b4 = " + b4);
        
    }
}
