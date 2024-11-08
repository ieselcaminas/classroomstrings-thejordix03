import java.util.Scanner;

public class Alfabetica {

    public static void main(String[] args) {
        String palabra = "dedo";

        boolean esAlfabetica = esAlfabetica(palabra);

        if (esAlfabetica) {
            System.out.println("La palabra " + palabra + " es alfabética.");
        } else {
            System.out.println("La palabra " + palabra + " no es alfabética.");
        }
    }

    public static boolean esAlfabetica(String palabra) {
        for (int i = 0; i < palabra.length() - 1; i++) {
            if (palabra.charAt(i) > palabra.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }
}
