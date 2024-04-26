package Operadores;

import java.util.Scanner;

public class OperdoresLogicosLogin {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String username = "Adrian";
        String password = "12345";
        String username2 = "Admin";
        String password2 = "12345";

        System.out.println("Ingrese el username: ");
        String usuario = input.nextLine();
        System.out.println("Ingrese el password: ");
        String pass = input.nextLine();

        boolean esAutenticado = false;

        if ( (username.equals(usuario) && password.equals(pass)) || (username2.equals(usuario) && password2.equals(pass))){
            esAutenticado = true;
        } else {
            System.out.println("Usuario o contraseña incorrectos");
        }
        if (esAutenticado){
            System.out.println("Bienvenido usuario ".concat(usuario).concat("!"));
        } else {
            System.out.println("Verifique sus credenciales");
        }

    }
}
