public class Siglas {


    public static String siglas(String[] palabras ) {
        String siglas = "";

        for (int i = 0; i < palabras.length; i++) {
            String palabra = palabras[i];
            if (Character.isUpperCase(palabra.charAt(0))) {
                siglas += palabra.charAt(0);
            }
        }
        return siglas;
    }

    public static void main(String[] args) {
        String frase = "Ecuela Oficial de Idiomas";

        String siglas = siglas(frase.split(" "));

        System.out.println("Siglas: " + siglas);
    }
}
