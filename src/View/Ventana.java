package View;

import Metodos.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {

    public Ventana() {

        //Creo una ventana con las medidas de mitad de pantalla tanto de alto como de ancho.
        Toolkit t = Toolkit.getDefaultToolkit();
        Dimension tpantalla = t.getScreenSize();
        int height = tpantalla.height;
        int widht = tpantalla.width;

        //posiciono la pantalla en el centro
        setBounds(widht / 4, height / 4, widht / 2, height / 2);

        //Propiedades básicas.
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);

        //Agrego los componentes de la ventana
        agregarComponentes();

        //Asigno un layout null al panel que ocupa toda la ventana.
        panel1.setLayout(null);

        //Algunas medidas para colocar el botón.
        int anchoBoton = height / 6;
        int altoBoton = anchoBoton / 2;
        int posicionBotonX = widht / 8 * 3;

        //Coloco el botón en su posición (he estado jugando con las medidas)
        boton1.setLocation(posicionBotonX, height / 25);
        boton1.setSize(anchoBoton, altoBoton);

        //Coloco el input en su posición
        text.setLocation(widht / 40, height / 25);
        text.setSize(500, altoBoton);

        //Un titulo para el input con mensaje de insertar un número entero
        label1.setBounds(widht / 40, 10, 250, 15);
        pane.setBounds(widht / 40, 150, 500, 200);

        //Acción del botón aceptar que hará que el número se compruebe con diferentes métodos
        boton1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                int numero = Integer.parseInt(text.getText());
                StringBuilder sb = new StringBuilder("Comprobando " + numero + ": ")
                        .append("\n\n")
                        .append("Número primo: ")
                        //Nos dirá si el núemro es primo.
                        .append(Primo.numeroPrimo(numero))
                        .append("\n")
                        .append("Par o impar: ")
                        //Nos dirá si el número es par o impar.
                        .append(ParImpar.parImpar(numero))
                        .append("\n")
                        .append("Divisores: ")
                        //Nos dará una lista de los divisores del número.
                        .append(Divisores.divisores(numero))
                        .append("\n")
                        .append("Perfecto: ")
                        //Nos dirá si el número es perfecto, abundante o deficiente.
                        .append(PerfectoAbundanteDeficiente.pad(numero))
                        .append("\n")
                        .append("Invertido: ")
                        //Nos devolverá el número dado la vuelta.
                        .append(InvertirDigitos.invertir(numero));

                pane.setText(sb.toString());
            }
        });
    }

    public void agregarComponentes() {

        add(panel1);
        add(boton1);
        add(text);
        add(label1);
        add(pane);
        
    }

    JPanel panel1 = new JPanel();

    JButton boton1 = new JButton("Aceptar");

    JLabel label1 = new JLabel("Introduce el número entero positivo que quieras buscar");

    JTextField text = new JTextField();

    JTextPane pane = new JTextPane();

}
