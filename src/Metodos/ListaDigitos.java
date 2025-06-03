package Metodos;

import java.util.ArrayList;
import java.util.List;

public class ListaDigitos {

    public static List<Integer> digitosLista(int numero){

        List<Integer> listaNumeros = new ArrayList<>();

        int numeroNuevo = numero;

        while(numeroNuevo != 0){

            listaNumeros.add(numeroNuevo % 10);
            numeroNuevo /= 10;
        }

        return listaNumeros;
    }
}
