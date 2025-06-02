package Metodos;

public class Primo {

    public static String numeroPrimo(int n) {

        boolean correcto = true;
        double raiz = Math.sqrt(n);
        String primo;

        for (int i = 2; i <= raiz; i++) {

            if ((n % i) == 0) {

                correcto = false;
                break;

            }
        }

        if (correcto) {
            primo = n + " es primo.";

        } else {
            primo = n + " no es primo.";
        }

        return primo;
    }
}
