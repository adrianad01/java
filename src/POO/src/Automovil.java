package POO.src;

public class Automovil {
    String fabricante;
    String modelo;
    String color = "azul";
    double cilindrada;

    public String detalle() {
        StringBuilder sb = new StringBuilder();
        sb.append("auto.fabricante = " + this.fabricante);
        sb.append("auto.modelo = " + this.modelo);
        sb.append("auto.color = " + this.color);
        sb.append("auto.cilindrada = " + this.cilindrada);
        return sb.toString();
    }
}
