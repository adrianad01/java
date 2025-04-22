package value_reference;

import java.util.Arrays;

public class PassByReference {
    public static void main(String[] args) {

        int[] age = {10,11,12};
        System.out.println("Inicialice main");
        for(int i : age){
            System.out.println(i);
        }
        System.out.println("Antes de invocar test");
        test(age);
        System.out.println("Despues de invocar test");
        for(int i : age){
            System.out.println(i);
        }
        System.out.println("Finaliza el método main con i");
    }

    public static void test(int[] ageArr){
        System.out.println("Iniciando el método test");
        for(int i : ageArr){
            System.out.println(i);
        }
        System.out.println("Finaliza con el nuevo valor de");
    }
}
