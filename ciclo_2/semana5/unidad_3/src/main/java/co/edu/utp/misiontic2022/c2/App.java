package co.edu.utp.misiontic2022.c2;

import java.awt.event.*;
import javax.swing.*;

/**
 * Swing
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        JFrame f = new JFrame("Ejemplo componentes");

        JLabel l1,l2;

        l1 = new JLabel("Caja de texto");
        l1.setBounds(50, 30, 150, 20);

        JTextField tf = new JTextField();
        tf.setBounds(50, 50, 150, 20);

        JButton b = new JButton("Click");
        b.setBounds(50, 100, 95, 30);
        b.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {
                tf.setText("Grupo 48"); 
            }
        });

        l2 = new JLabel("Boton imagen");
        l2.setBounds(50, 180, 200, 20);
        JButton bima = new JButton(new ImageIcon("./mintic.png"));
        bima.setBounds(50, 200, 200, 100);
    
        f.add(tf);
        f.add(b);
        f.add(bima);
        f.add(l1);
        f.add(l2);
        f.setSize(400, 500);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
