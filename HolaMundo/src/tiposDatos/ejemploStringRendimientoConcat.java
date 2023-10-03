package tiposDatos;

public class ejemploStringRendimientoConcat {
    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a); //Es el más eficiente para concatenar grandes cantidades de Strings

        long inicio = System.currentTimeMillis(); // retorna un tipo long

        for (int i = 0; i< 1000; i++){
            // c = c.concat(a).concat(b).concat("\n"); //Demoró 2ms
            // c += a+b+"\n"; //Demoró 11ms
            sb.append(a).append(b).append("\n"); //Demoró 0 ms
        }

        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());



    }
}
