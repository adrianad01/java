package tiposDatos;
public class EjemploStringMetodos {
    public static void main(String[] args) {
        String nombre = "Adrian";
        System.out.println("nombre.length() = " + nombre.length()); //Cantidad de Caracteres
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase()); //Mayúsculas
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase()); //Minúsculas
        System.out.println("nombre.equals(\"Adrian\") = " + nombre.equals("Adrian")); //Ver si la variable es igual al valor
        System.out.println("nombre.equals(\"adrian\") = " + nombre.equals("adrian")); //Valida que la es distinto lo que va en el .equals con el valor
        System.out.println("nombre.equalsIgnoreCase(\"adrian\") = " + nombre.equalsIgnoreCase("adrian")); //Ignora si es mayúscula o minúscula
        System.out.println("nombre.compareTo(\"Adrian\") = " + nombre.compareTo("Adrian")); 
        System.out.println("nombre.compareTo(\"Aaron\") = " + nombre.compareTo("Aaron"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0)); //Recibe un caracter del string, siendo el primer caracter el 0
        System.out.println("nombre.charAt(4) = " + nombre.charAt(4));
        System.out.println("nombre.charAt(4) = " + nombre.charAt(5));
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1)); //Se obtiene de forma dinámica el último caracter
        System.out.println("nombre.substring(1) = " + nombre.substring(1)); //Elimina n caracteres del valor del string, en este caso 1 y empieza en drian
        System.out.println("nombre.substring(0) = " + nombre.substring(0));
        System.out.println("nombre.substring(1,4) = " + nombre.substring(1,4)); //Desde el 1 hasta el 4
        System.out.println("nombre.substring(4,6) = " + nombre.substring(4,6));
        System.out.println("nombre.substring(5) = " + nombre.substring(5));
        System.out.println("nombre.substring(nombre.length()-1) = " + nombre.substring(nombre.length()-1)); //De manera dinámica se obtiene el último caracter
        
        
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace(\"a\", \"A\") = " + trabalenguas.replace("a", "%")); //remplaza caracter por otro
        System.out.println("trabalenguas = " + trabalenguas);
        System.out.println("trabalenguas = " + trabalenguas.indexOf('a')); //Indica la posición del caracter comenzando en 0
        System.out.println("trabalenguas = " + trabalenguas.lastIndexOf('a')); //Indica la última posición del caracter comenzando en 0
        System.out.println("trabalenguas = " + trabalenguas.lastIndexOf('z')); //Arroja valor negativo por que no existe el caracter en el valor del string
        System.out.println("trabalenguas.contains(\"t\") = " + trabalenguas.contains("r")); //Indica valor booleano, en este caso si contiene o no el caracter y se escribe con dobles comillas
        System.out.println("trabalenguas.startsWith(\"lenguas\") = " + trabalenguas.startsWith("lenguas")); //indica un valor booleano (false)
        System.out.println("trabalenguas.startsWith(\"trab\") = " + trabalenguas.startsWith("trab")); //el valor es true por que inicia con trab
        System.out.println("trabalenguas.endsWith(\"lenguas\") = " + trabalenguas.endsWith("lenguas")); //indiva el valor o valores con los que termina el valor y es true
        System.out.println("  trabalenguas  ");
        System.out.println("  trabalenguas  ".trim()); //Quita los espacios en blanco a la derecha e izquierda




    }
}
