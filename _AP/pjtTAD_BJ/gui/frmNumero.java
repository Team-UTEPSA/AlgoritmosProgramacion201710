package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import cls.*;

public class frmNumero extends JFrame{
    private clsNumero objNum = new clsNumero();
    
    private JLabel lblTitulo = new JLabel("Tipo de Datos Abstracto NÚMERO");
    private JLabel lblEntrada = new JLabel("Entrada:");
    private JLabel lblSalida = new JLabel("Salida:");
    private JTextField txtEntrada = new JTextField();
    private JTextField txtSalida = new JTextField();
    private JButton btnCargar = new JButton("Cargar");
    private JButton btnObtener = new JButton("Obtener");
    private JButton btnDigitosPares = new JButton("Ver digitos pares");
    
   
    
    private JButton btnCerrar = new JButton("Cerrar");
    
    private clsUtilsGUI mUtils = new clsUtilsGUI();
    
    
    
    //Constructor
    public frmNumero() {
        try {
            objNum = new clsNumero();
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    //Runner
    public static void main(String[] args) {
        frmNumero frmNum = new frmNumero();
        frmNum.setVisible(true);
    }    
    
    
    
    
    private void jbInit() throws Exception {
        int frmAncho = 515;
        int frmAlto = 500;

        //frmPrincipal:: Configurarción de las propiedades del Formulario
        getContentPane().setLayout(null);
        setSize(frmAncho, frmAlto);
        setTitle("TAD:: Clase Número");
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        
        //frmPrincipal:: Configuración de las propiedades de los objetos del Formulario
        lblTitulo.setBounds(new Rectangle(0, 5, frmAncho, 30));
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitulo.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));

        lblEntrada.setBounds(new Rectangle(10, 40, 50, 30));
        
        lblSalida.setBounds(new Rectangle(10, 80, 50, 30));
        
        txtEntrada.setBounds(new Rectangle(62, 40, 320, 30));
  
        txtSalida.setBounds(new Rectangle(62, 80, 430, 30));        
        
        btnCargar.setBounds(new Rectangle(390, 40, 100, 30));
        btnCargar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnCargar_actionPerformed(e);
            }
        });
        
        btnObtener.setBounds(new Rectangle(10, 120, 150, 30));
        btnObtener.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnObtener_actionPerformed(e);
            }
        });        
                
        btnDigitosPares.setBounds(new Rectangle(170, 120, 150, 30));
        btnDigitosPares.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnDigitosPares_actionPerformed(e);
            }
        });     
        
        
        
        
        
        
        
        btnCerrar.setBounds(new Rectangle(getWidth()-120, (getHeight()-70), 100, 30));
        btnCerrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnCerrar_actionPerformed(e);
            }
        });
        
        
        
        
        getContentPane().add(lblTitulo, null);
        getContentPane().add(lblEntrada, null);
        getContentPane().add(lblSalida, null);
        getContentPane().add(txtEntrada, null); 
        getContentPane().add(txtSalida, null);
        getContentPane().add(btnCargar, null);
        getContentPane().add(btnObtener, null);
        getContentPane().add(btnDigitosPares, null);
        
        
        getContentPane().add(btnCerrar, null);
        
    }
    
    
    private void btnCargar_actionPerformed(ActionEvent e) {           
        long iNum = Long.parseLong(txtEntrada.getText());
        objNum.setNumero(iNum);
        txtSalida.setText("");
    }
    
    private void btnObtener_actionPerformed(ActionEvent e) {
        txtSalida.setText(objNum.aString());
    }
    
    private void btnDigitosPares_actionPerformed(ActionEvent e) {
        txtSalida.setText(""+(objNum.DigitosPares()));
    }
    
    
    
    
    private void btnCerrar_actionPerformed(ActionEvent e) {
        dispose();
    }
    
    
    
}
