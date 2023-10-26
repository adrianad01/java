public class Persona {
    String nombre;
    int edad;

    public String detail (){
        StringBuilder sb = new StringBuilder();

        sb.append(("this.nombre = " + this.nombre));
        sb.append(("\nthis.edad = " + this.edad));
        return sb.toString();
    }
}
