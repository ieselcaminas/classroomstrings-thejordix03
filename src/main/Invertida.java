public class Invertida {

    public static void main(String[] args) {
        String frase = "Esto es una frase";

        String fraseInvertida = invertir(frase);

        System.out.println("Frase invertida: " + fraseInvertida);
    }

    public static String invertir(String frase) {
        String[] palabras = frase.split("\\s+");

        String fraseInvertida = "";

        for (int i = palabras.length - 1; i >= 0; i--) {
            fraseInvertida += palabras[i];

            if (i > 0) {
                fraseInvertida += " ";
            }
        }
        return fraseInvertida;
    }
}
