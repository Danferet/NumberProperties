package View;

import Metodos.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Ventana extends JFrame {

    public Ventana() {

        Toolkit t = Toolkit.getDefaultToolkit();
        setLayout(null);
        Dimension tpantalla = t.getScreenSize();
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        int height = tpantalla.height;
        int widht = tpantalla.width;


        int withd2 = 852;
        int height2 = 532;

        //System.out.println(height/4);
        //System.out.println(widht/4);

        setBounds(widht / 4, height / 4, widht / 2, height / 2);

        setVisible(true);

        agregarComponentes();

        panel1.setLayout(null);

        int anchoBoton = 150;
        int altoBoton = anchoBoton / 2;
        int posicionBotonX = 852 / 4 * 3;

        System.out.println(posicionBotonX);

        boton1.setLocation(posicionBotonX, 25);
        boton1.setSize(anchoBoton, altoBoton);


        text.setLocation(50, 25);
        text.setSize(500, altoBoton);

        label1.setBounds(50, 10, 250, 15);
        pane.setBounds(50, 150, 500, 200);

        boton1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                int numero = Integer.parseInt(text.getText());
                StringBuilder sb = new StringBuilder("Comprobando " + numero + ": ")
                        .append("\n\n")
                        .append("Número primo: ")
                        .append(Primo.numeroPrimo(numero))
                        .append("\n")
                        .append("Par o impar: ")
                        .append(ParImpar.parImpar(numero))
                        .append("\n")
                        .append("Divisores: ")
                        .append(Divisores.divisores(numero))
                        .append("\n")
                        .append("Perfecto: ")
                        .append(PerfectoAbundanteDeficiente.pad(numero))
                        .append("\n")
                        .append("Invertido: ")
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

    JLabel label1 = new JLabel("Introduce el número que quieras buscar");

    JLabel label2 = new JLabel();

    JTextField text = new JTextField();

    JTextPane pane = new JTextPane();


}
