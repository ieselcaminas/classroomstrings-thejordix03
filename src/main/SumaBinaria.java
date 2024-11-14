public class SumaBinaria {

    public static String sumarBinarios(String bin1, String bin2) {

        String resultado = "";
        int acarreo = 0;

        if (bin1.length() < bin2.length()) {
            for (int i = bin1.length(); i < bin2.length(); i++) {
                bin1 = "0" + bin1;
            }
        } else if (bin2.length() < bin1.length()) {
            for (int i = bin2.length(); i < bin1.length(); i++) {
                bin2 = "0" + bin2;
            }
        }
        for (int i = bin1.length() - 1; i >= 0; i--) {
            int bit1 = bin1.charAt(i) - '0';
            int bit2 = bin2.charAt(i) - '0';

            int suma = bit1 + bit2 + acarreo;
            resultado = (suma % 2) + resultado;
            acarreo = suma / 2;
        }
        if (acarreo == 1) {
            resultado = '1' + resultado;
        }

        return resultado;
    }

    public static void main(String[] args) {
        String bin1 = "100";
        String bin2 = "111";

        String resultado = sumarBinarios(bin1, bin2);

        System.out.println("La suma binaria de " + bin1 + " y " + bin2 + " es: " + resultado);
    }
}
