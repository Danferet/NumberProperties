package Metodos;

import java.util.ArrayList;
import java.util.List;

public class Niven {

    public static String numeroNiven(int numero){

        String resultado;

        List<Integer> listaNumeros = ListaDigitos.digitosLista(numero);

        int suma = 0;

        for(int i = 0; i<listaNumeros.size();i++){

            suma += listaNumeros.get(i);

        }

        if(numero % suma == 0){

            resultado = numero + " es un número de Niven.";

        }else{

            resultado = numero + " no es un numero de niven.";
        }

        return resultado;
    }
}
