package repaso;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int numero;
//        System.out.println("Ingrese un numero entero positivo: ");
//        numero = input.nextInt();
//
//        if (numero < 0){
//            System.out.println("El numero no es un numero positivo, favor de ingresar el dato correctamente");
//        }
//        for (int i = 1; i <=10; i++){
//            System.out.println("i = " + i);
//        }
//        System.out.println("----------------------------");
//        for (int i = 10; i >=1; i--){
//            System.out.println("i = " + i);
//        }
//-------------------------------------------------------------------------

//        Scanner input = new Scanner(System.in);
//        int numero, resultado=0;
//        System.out.println("Ingrese un numero: ");
//        numero = input.nextInt();
//
//        for(int i = 1; i <=10; i++){
//            resultado = i * numero;
//            System.out.println(+numero+" * "+i+" = " +resultado);
//        }
//        -------------------------------------------------------
//        System.out.println("----------------------------------");
//        for (int i = 2; i<=20; i+=2){
//            System.out.println("i = " + i);
//        }
//        System.out.println("----------------------------------");
//        for (int i = 1; i<=20; i+=2){
//            System.out.println("i = " + i);
//        }


        Scanner input = new Scanner(System.in);
        int numero, resultado=0;
        System.out.println("Ingrese un numero: ");
        numero = input.nextInt();
        for (int i = 1; i<=numero; i++){
         resultado += i;
       }
        System.out.println("resultado = " + resultado);
    }
}
