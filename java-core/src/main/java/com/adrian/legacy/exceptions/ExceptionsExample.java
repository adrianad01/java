package com.adrian.legacy.exceptions;

public class ExceptionsExample {
    public static void main(String[] args) {

        // Este bloque genera una unchecked exception
         /*
            String str = null;
            System.out.println(str.length());
         */


        // Este bloque genera una checked exception
        try{
            int a = 30, b= 0;
            int c = a/b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Cant divide by zero" + e);
        }
    }
}
