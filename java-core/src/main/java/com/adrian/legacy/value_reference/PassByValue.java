package com.adrian.legacy.value_reference;

public class PassByValue {
    public static void main(String[] args) {

        int i = 10;
        System.out.println("iniciamos el método main con i = " + i);
        test(i);
        System.out.println("Finaliza el método main con i = " + i);
    }

    public static void test(int i){
        System.out.println("Iniciando el método test con i = " + i);
        i = 35;
        System.out.println("Finaliza con el nuevo valor de i = " + i);
    }
}
