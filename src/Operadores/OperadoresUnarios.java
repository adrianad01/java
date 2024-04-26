package Operadores;

public class OperadoresUnarios {
    public static void main(String[] args) {
        int i = -5;
        int j = +i;
        System.out.println("j = " + j);
        
        int k = -i;
        System.out.println("k = " + k);
        
        i = 6;
        j += +i;
        System.out.println("j = " + j);
    }
}
