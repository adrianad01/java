package Operadores;

import java.util.Scanner;

public class OperdoresLogicosLoginArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String [] usernames = new String[2];
        String [] passwords = new String[2];
        usernames [0] = "adrian";
        passwords [0] = "12345";
        usernames [1] = "admin";
        passwords [1] = "12345";

        System.out.println("Ingrese el username: ");
        String usuario = input.nextLine();
        System.out.println("Ingrese el password: ");
        String pass = input.nextLine();

        boolean esAutenticado = false;

        for (int i = 0; i < usernames.length; i++){

            esAutenticado = (usernames[i].equals(usuario) && passwords[i].equals(pass)) ? true : esAutenticado;


            /*if (usernames[i].equals(usuario) && passwords[i].equals(pass)){
                esAutenticado = true;
                break;
            }*/
        }

        if (esAutenticado){
            System.out.println("Bienvenido usuario ".concat(usuario).concat("!"));
        } else {
            System.out.println("Usuario o contraseña incorrectos");
            System.out.println("Verifique sus credenciales");
        }
    }
}
