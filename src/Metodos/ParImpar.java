package Metodos;

public class ParImpar {

    public static String parImpar(int numero) {

        String resultado;

        if (numero % 2 != 0) {

            resultado = numero + " es un número impar.";
        } else {
            resultado = numero + " es un número par.";
        }

        return resultado;
    }
}
