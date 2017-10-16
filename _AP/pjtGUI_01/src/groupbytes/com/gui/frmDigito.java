package groupbytes.com.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frmDigito extends JFrame {
    private JLabel lblTitulo = new JLabel("Tipo de Datos Abstracto DIGITO");
    private JButton btnCerrar = new JButton("Cerrar");


    //Constructor
    public frmDigito() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //Runner
    public static void main(String[] args) {
        frmDigito frmDig = new frmDigito();
        frmDig.setVisible(true);
    }


    private void jbInit() throws Exception {
        int frmAncho = 515;
        int frmAlto = 500;

        //frmPrincipal:: Configurarción de las propiedades del Formulario
        getContentPane().setLayout(null);
        setSize(frmAncho, frmAlto);
        setTitle("TAD:: Clase Digito");
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        //frmPrincipal:: Configuración de las propiedades de los objetos del Formulario
        lblTitulo.setBounds(new Rectangle(0, 5, frmAncho, 30));
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitulo.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));

        btnCerrar.setBounds(new Rectangle(getWidth()-120, (getHeight()-70), 100, 30));
        btnCerrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnCerrar_actionPerformed(e);
            }
        });


        getContentPane().add(lblTitulo, null);
        getContentPane().add(btnCerrar, null);

    }


    //frmPrincipal:: Implementaciones de eventos de los objetos
    private void btnCerrar_actionPerformed(ActionEvent e) {
        System.out.println("Clic en botón Salir");
        dispose();
    }


}
