package Metodos;

public class InvertirDigitos {

    public static String invertir(int numero) {

        int num = numero;

        int numeroNuevo = 0;

        while (num != 0) {

            numeroNuevo = numeroNuevo * 10 + (num % 10);
            num = num / 10;

        }
        return "El numero " + numero + " invertido es el " + numeroNuevo;
    }
}
