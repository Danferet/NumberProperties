package Metodos;

import java.util.ArrayList;
import java.util.List;

public class Divisores {

    public static String divisores(int numero) {

        List<Integer> listaDivisores = new ArrayList<>();

        String resultado;

        int mitad = numero / 2;

        for (int i = 2; i <= mitad; i++) {

            if (numero % i == 0) {

                listaDivisores.add(i);

            }
        }

        StringBuilder sb = new StringBuilder(numero + " tiene los siguientes divisores: ");

        if (listaDivisores.size() > 1) {

            for (int i = 0; i < listaDivisores.size(); i++) {

                if (i != listaDivisores.size() - 1) {

                    sb.append(listaDivisores.get(i)).append(", ");

                } else {
                    sb.append(listaDivisores.get(i)).append(".");
                }
            }

            resultado = sb.toString();


        } else {

            sb.append("El numero ")
                    .append(numero)
                    .append(" es primo y sus divisores son 1 y ")
                    .append(numero)
                    .append(".");

            resultado = sb.toString();

        }

        return resultado;
    }

    public static List<Integer> listaDivisores(int numero) {

        List<Integer> divisores = new ArrayList<>();

        int mitad = numero / 2;

        for (int i = 1; i <= mitad; i++) {

            if (numero % i == 0) {

                divisores.add(i);

            }
        }

        return divisores;
    }

}
