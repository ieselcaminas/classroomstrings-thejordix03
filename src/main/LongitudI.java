public class LongitudI {

    public static int comprueba(String texto, int longitud) {
        String[] palabras = texto.split("\\s+");
        int contador = 0;

        for (String palabra : palabras) {
            if (palabra.length() == longitud) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        String texto = "esto es una frase de ejemplo";
        int longitud = 2;

        int cantidad = comprueba(texto, longitud);

        System.out.println("Número de palabras con longitud " + longitud + ": " + cantidad);
    }
}

