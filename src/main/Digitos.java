public class Digitos {

    public static int cuantosSonDigitos(String texto) {
        int contador = 0;

        for (int i = 0; i < texto.length(); i++) {
            if (Character.isDigit(texto.charAt(i))) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        String texto = "1 20 hola 234 45a";

        int cantidad = cuantosSonDigitos(texto);

        System.out.println("Cantidad de dígitos en la cadena: " + cantidad);
    }

}
