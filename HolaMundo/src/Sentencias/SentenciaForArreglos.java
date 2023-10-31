package Sentencias;

public class SentenciaForArreglos {
    public static void main(String[] args) {

        String [] nombres = {"Adrian", "Jose", "Manuel", "Hugo", "Maria", "Fernanda", "Gerardo", "Alberto"};
        int count = nombres.length;
        for (int i = 0; i < count; i ++){
            if (nombres[i].equalsIgnoreCase("adrian") || nombres[i].equalsIgnoreCase("gerardo")){
                continue;
            }
            System.out.println(i + "- " +nombres[i]);
        }

    }
}
