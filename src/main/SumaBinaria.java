public class SumaBinaria {

    public static String sumarBinarios(String num1, String num2) {
        String resultado = "";
        char b1, b2;
        int bit1, bit2, acarreo = 0, suma;
        for (int i = num1.length() - 1; i >= 0; i--) {
            b1 = num1.charAt(i);
            b2 = num2.charAt(i);
            bit1 = Integer.parseInt("" + b1);
            bit2 = Integer.parseInt("" + b2);
            suma = bit1 + bit2 + acarreo;

            resultado = (suma % 2 == 0 ? "0" : "1") + resultado;

            acarreo = (suma <= 1 ? 0 : 1);
        }
        if (acarreo == 1) {
            resultado = "1" + resultado;
        }
        return resultado;
    }
    public static int convertirBinarioADecimal(String binario) {
        int decimal = 0;
        int potencia = 0;

        for (int i = binario.length() - 1; i >= 0; i--) {
            int bit = Character.getNumericValue(binario.charAt(i));
            decimal += bit * Math.pow(2, potencia);
            potencia++;
        }
        return decimal;
    }
    public static void main(String[] args) {
        String bin1 = "111";
        String bin2 = "111";

        String resultadoBinario = sumarBinarios(bin1, bin2);

        int resultadoDecimal = convertirBinarioADecimal(resultadoBinario);

        System.out.println("La suma binaria de " + bin1 + " y " + bin2 + " es: " + resultadoBinario);
        System.out.println("El resultado en decimal es: " + resultadoDecimal);
    }
}
