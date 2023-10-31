//Calcular la suma de los primeros 50 números naturales usando un bucle for.
package EjerciciosSentencias;

public class EjercicioOcho {
    public static void main(String[] args) {

        int suma = 0;
        for (int i = 1; i <=50; i++){
            suma = suma + i;
        }
        System.out.println("La suma de todos los números naturales es: "+suma);
    }
}
