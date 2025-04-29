package poo;

public class InstanceOf {
    public static void main(String[] args) {

        Object object = "Hola Mundo";
        if (object instanceof String s) {
            System.out.println("La longitud es " + s.length());
        }

        String string = "Hola Mundo";
        boolean bool = string instanceof String;
        System.out.println(bool);
    }
}
