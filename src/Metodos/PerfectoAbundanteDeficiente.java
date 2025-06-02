package Metodos;

import java.util.List;

public class PerfectoAbundanteDeficiente {

    public static String pad(int numero) {

        List<Integer> listaDivisores = Divisores.listaDivisores(numero);

        String resultado;

        int suma = 0;

        for (int i = 0; i < listaDivisores.size(); i++) {

            suma += listaDivisores.get(i);

        }

        if (suma > numero) {

            resultado = numero + " es un número abundante.";

        } else if (suma < numero) {
            resultado = numero + " es un número deficiente.";

        } else {

            resultado = numero + " es un número perfecto.";
        }
        return resultado;
    }
}
