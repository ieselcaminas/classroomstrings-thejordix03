import java.util.Scanner;
public class LongitudII {

    public static void main(String[] args) {

        String texto = "esto es una frase";
        boolean existe = false;
        int longitud = 1;

        boolean resultado = comprueba(texto, longitud);

        if (resultado) {
            System.out.println("Sí, existe al menos una palabra de longitud " + longitud + ".");
        } else {
            System.out.println("No, no existe ninguna palabra de longitud " + longitud + ".");
        }

    }

    public static boolean comprueba(String texto, int longitud) {
        String[] palabras = texto.split("\\s+");

        for (String palabra : palabras) {
            if (palabra.length() == longitud) {
                return true;
            }
        }
        return false;
    }
}
