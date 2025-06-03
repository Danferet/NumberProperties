package Metodos;

import java.util.ArrayList;
import java.util.List;

public class Niven {

    public static String numeroNiven(int numero){

        String resultado;

        List<Integer> listaNumeros = new ArrayList<>();

        int numeroNuevo = numero;

        while(numeroNuevo != 0){

            listaNumeros.add(numeroNuevo % 10);
            numeroNuevo /= 10;
        }

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
