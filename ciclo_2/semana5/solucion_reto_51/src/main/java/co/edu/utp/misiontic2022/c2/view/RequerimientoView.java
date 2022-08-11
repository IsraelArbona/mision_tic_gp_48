package co.edu.utp.misiontic2022.c2.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import co.edu.utp.misiontic2022.c2.controller.RequerimientoController;
import co.edu.utp.misiontic2022.c2.model.vo.AsesorPorCiudadVo;
import co.edu.utp.misiontic2022.c2.model.vo.CompraPorProveedorVo;
import co.edu.utp.misiontic2022.c2.model.vo.ProyectoCasaCampestreVo;

public class RequerimientoView extends JFrame {

    public static final RequerimientoController controlador = new RequerimientoController();

    // Mitigar los errores de instancia
    private static final long serialVersionUID = 1L;

    private JPanel contenPane;
    private JTextArea textArea;

    public RequerimientoView() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(400, 100, 800, 650);

        contenPane = new JPanel();
        contenPane.setBorder(new EmptyBorder(5,5,5,5));
        setContentPane(contenPane);
        contenPane.setLayout(null);

        JLabel lbTitulo = new JLabel(" -- Reto 5");
        lbTitulo.setBounds(28, 6, 61, 16);
        contenPane.add(lbTitulo);

        // Dimiension de contenido
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(28, 60, 747, 455);
        contenPane.add(scrollPane);

        // proporcionar una vista desplazable
        textArea = new JTextArea();
        scrollPane.setViewportView(textArea);

        JButton btnConsulta1 = new JButton("Informe 1");
        btnConsulta1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {
                informe1(); 
            }
        });
        btnConsulta1.setBounds(28, 537, 133, 29);
        contenPane.add(btnConsulta1);

        JButton btnConsulta2 = new JButton("Informe 2");
        btnConsulta2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                informe2();
            }
        });
        btnConsulta2.setBounds(164, 537, 133, 29);
        contenPane.add(btnConsulta2);

        JButton btnConsulta3 = new JButton("Informe 3");
        btnConsulta3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {
                informe3();
            }
        });
        btnConsulta3.setBounds(302, 537, 133, 29);
        contenPane.add(btnConsulta3);

        JButton btnLimpiar = new JButton("Limpiar");
        btnLimpiar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {
                textArea.setText("");
            }
        });
        btnLimpiar.setBounds(652, 537, 120, 29);
        contenPane.add(btnLimpiar);

    }

    public void informe1() {
        try {
            ArrayList<AsesorPorCiudadVo> asesores = controlador.consultarAsesorPorCiudad();
            String salida = "**** Asesor Por Ciudad **** \n\nId Lider \t Nombre \t Primer Apellido \t Residencia\n\n";

            for (AsesorPorCiudadVo asesor: asesores){
                salida += asesor.getIdLider() + " \t ";
                salida += asesor.getNombre() + " \t ";
                salida += asesor.getPrimerApellido() + " \t\t ";
                salida += asesor.getCiudadResidencia() + "\n";
            }
            textArea.setText(salida);
        } catch (SQLException e) {
            System.err.println("Error inesperado...." + e.getMessage());
        }
    }

    public void informe2() {
        try {
            ArrayList<ProyectoCasaCampestreVo> casas = controlador.consultarProyectoCasaCampestre();
            String salida = "**** Proyecto Casa Campestre **** \n\nId Proyecto \t Constructora \t\t Habitaciones \t Ciudad \n\n";

            for (ProyectoCasaCampestreVo casa: casas) {
                salida += casa.getIdProyecto() + " \t ";
                salida += casa.getConstructora();
                
                
                salida += casa.getNumeroHabitaciones() + " \t ";
                salida += casa.getCiudad() + "\n";
            }

            textArea.setText(salida);

        } catch (SQLException e) {
            System.err.println("Error inesperado...." + e.getMessage());
        }
    }

    public void informe3() {
        try {
            ArrayList<CompraPorProveedorVo> compras = controlador.consultarCompraPorProveedor();
            String salida = "**** Compras Por Proveedor **** \n\nId Compra \t Constructora \t\t Banco Vinculado \n\n";

            for (CompraPorProveedorVo compra: compras) {
                salida += compra.getIdCompra() + " \t ";
                salida += compra.getConstructora();
                if (compra.getConstructora().length() <= 11){
                    salida += " \t\t ";
                } else {
                    salida += " \t ";
                }
                salida += compra.getBancoVinculado() + "\n";
            }
            
            textArea.setText(salida);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

   
}
