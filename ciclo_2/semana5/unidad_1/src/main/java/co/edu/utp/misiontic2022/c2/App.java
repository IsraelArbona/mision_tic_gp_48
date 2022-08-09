package co.edu.utp.misiontic2022.c2;

import javax.swing.*;

/**
 * Swing
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        JFrame marco = new JFrame(); // Creando una instancia con jframe

        JButton boton = new JButton("Click"); // Creando una instancia con jbutton
        boton.setBounds(130, 100, 100, 40); // x axis, y axis, width, height

        marco.add(boton); // Agregamos un boton dentro del jframe

        marco.setSize(400,500); // 400 de width y 500 de height
        marco.setLayout(null); // se asigna manager null
        marco.setVisible(true); // volver visible el jframe

    }
}
