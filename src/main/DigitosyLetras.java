public class DigitosyLetras {

    public static int contarNumeros(String texto) {
        int contador = 0;
        String[] palabras = texto.split(" ");

        for (int i = 0; i < palabras.length; i++) {
            if (esNumero(palabras[i])) {
                contador++;
            }
        }

        return contador;
    }

    public static boolean esNumero(String palabra) {
        for (int i = 0; i < palabra.length(); i++) {
            if (!Character.isDigit(palabra.charAt(i))) {
                return false;
            }
        }
        return !palabra.isEmpty();
    }

    public static boolean existeLetra(String texto) {
        for (int i = 0; i < texto.length(); i++) {
            if (Character.isLetter(texto.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String texto = "1 20 hshs 234 45";

        int cantidadNumeros = contarNumeros(texto);
        boolean hayLetra = existeLetra(texto);

        System.out.println("Cantidad de números en la cadena: " + cantidadNumeros);
        if (hayLetra) {
            System.out.println("Existe al menos una letra en el texto.");
        } else {
            System.out.println("No existe ninguna letra en el texto.");
        }
    }
}
