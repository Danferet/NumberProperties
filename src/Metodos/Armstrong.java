package Metodos;

import java.util.List;

public class Armstrong {

    public static String ArmstrongNum(int numero) {

        String resultado;

        List<Integer> listaDigitos = ListaDigitos.digitosLista(numero);

        int armstrong = 0;

        for(int i = 0; i<listaDigitos.size(); i++){

            armstrong += (int)Math.pow(listaDigitos.get(i),listaDigitos.size());

        }

        if(numero == armstrong){

            resultado = numero + " es un número de Armstrong.";

        }else{

            resultado = numero + " no es un número de Armstrong.";
        }

        return resultado;
    }
}
