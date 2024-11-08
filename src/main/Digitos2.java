public class Digitos2 {

    public static int contarNumeros(String texto) {
        int contador = 0;
        String[] palabras = texto.split(" ");

        for (String palabra : palabras) {
            if (esNumero(palabra)) {
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

    public static void main(String[] args) {
        String texto = "1 20 hola 234 45a";

        int cantidadNumeros = contarNumeros(texto);

        System.out.println("Cantidad de números en la cadena: " + cantidadNumeros);
    }
}
