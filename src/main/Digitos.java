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
        String texto = "un 1 y un 20";

        int cantidad = cuantosSonDigitos(texto);

        System.out.println("Cantidad de dígitos en la cadena: " + cantidad);
    }

}
