import java.util.Scanner;

public class Pasatiempos {


    public static String crearPasatiempo(String frase) {
        String fraseCifrada = "";

        for (int i = 0; i < frase.length(); i++) {

            char letra = frase.charAt(i);

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ||
                    letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
                fraseCifrada += ".";
            } else {
                fraseCifrada += letra;
            }
        }
        return fraseCifrada;
    }
    public static void main(String[] args) {

        String frase = "Esto es una frase";

        String fraseCifrada = crearPasatiempo(frase);

        System.out.println("Frase cifrada: " + fraseCifrada);
    }
}
