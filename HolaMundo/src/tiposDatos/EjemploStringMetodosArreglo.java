package tiposDatos;
public class EjemploStringMetodosArreglo {
    public static void main(String[] args) {
        
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());
        char [] arreglo = trabalenguas.toCharArray();
        int largo = arreglo.length;
        System.out.println("largo = " + largo);
        for (int i = 0; i<largo; i++){
            //System.out.println("arreglo[i] = " + arreglo[i]);
            System.out.print(arreglo[i]);
        }
        System.out.println();
        System.out.println("trabalenguas = " + trabalenguas.split("a"));



        //La "a" es el separador
        String [] arreglo2 = trabalenguas.split("a");
        int l = arreglo2.length;
        for (int i = 0; i<l; i++){
            System.out.println(arreglo2[i]);
        }
        System.out.println("arreglo2 = " + arreglo2);

        String archivo = "alguna.imagen.pdf";
        String [] archivoArray = archivo.split("\\.");
        l = archivoArray.length;
        for (int i = 0; i<l; i++){
            System.out.println(archivoArray[i]);
        }
    }
}
