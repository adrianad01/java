package Sentencias;

public class SentenciaIfElse {
    public static void main(String[] args) {

        float promedio = 6.8f;
        if (promedio >= 6.5){
            System.out.println("Tienes promedio excelente");
        } else if (promedio >= 6.0){
            System.out.println("Muy Buen Promedio");
        } else if (promedio >= 5.5) {
            System.out.println("Buen Promedio");
        } else if (promedio >= 5.0) {
            System.out.println("Regular");
        } else if (promedio >= 4.0) {
            System.out.println("Insuficiente");
        } else {
            System.out.println("Reprobado");
        }

        System.out.println("Tu promedio es: " + promedio);
    }
}
