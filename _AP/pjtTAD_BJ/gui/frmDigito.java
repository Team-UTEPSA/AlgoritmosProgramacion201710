package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import cls.*;

public class frmDigito extends JFrame {
    private clsDigito objDig = new clsDigito();
    private JLabel lblTitulo = new JLabel("Tipo de Datos Abstracto DIGITO");
    private JLabel lblEntrada = new JLabel("Entrada:");
    private JLabel lblSalida = new JLabel("Salida:");
    private JTextField txtEntrada = new JTextField();
    private JTextField txtSalida = new JTextField("");
    private JButton btnCargar = new JButton("Cargar");
    private JButton btnObtener = new JButton("Obtener");
    private JButton btnPar = new JButton("Par");
    private JButton btnASCII = new JButton("ASCII");
    private JButton btnCerrar = new JButton("Cerrar");

   
    //Constructor
    public frmDigito() {
        try {
            objDig = new clsDigito();
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

        lblEntrada.setBounds(new Rectangle(10, 40, 50, 30));
        
        lblSalida.setBounds(new Rectangle(10, 80, 50, 30));
        
        txtEntrada.setBounds(new Rectangle(62, 40, 50, 30));
  
        txtSalida.setBounds(new Rectangle(62, 80, 430, 30));
        
        btnCargar.setBounds(new Rectangle(200, 40, 150, 30));
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
        
        btnPar.setBounds(new Rectangle(170, 120, 150, 30));
        btnPar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnPar_actionPerformed(e);
            }
        });
        
        btnASCII.setBounds(new Rectangle(330, 120, 150, 30));
        btnASCII.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnASCII_actionPerformed(e);
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
        getContentPane().add(btnPar, null);
        getContentPane().add(btnASCII, null);
        

        getContentPane().add(btnCerrar, null);

        

        
        
        
        
        
    }


    //frmPrincipal:: Implementaciones de eventos de los objetos
    
    private void btnCargar_actionPerformed(ActionEvent e) {           
            String sDig = ""+txtEntrada.getText().charAt(0);
            byte yDig = Byte.parseByte(sDig,16);
            objDig.setDigito(yDig);
            txtSalida.setText("");
    }
    
    private void btnObtener_actionPerformed(ActionEvent e) {
        txtSalida.setText(objDig.aString());
    }
    
    private void btnPar_actionPerformed(ActionEvent e) {
        if(objDig.Par()){
            msgbox("Par");
        }else{
             msgbox("Impar");
        }
    }    
    
    
    private void btnASCII_actionPerformed(ActionEvent e) {
        //System.out.println("Clic en botón ASCII");
        txtSalida.setText("" + objDig.aASCII());
    }    
    
    
    private void btnCerrar_actionPerformed(ActionEvent e) {
        dispose();
    }


    
    //METODOS:: Auxiliares
    private void msgbox(String msg){
        JOptionPane.showMessageDialog(null, msg, "TAD:: Información", JOptionPane.INFORMATION_MESSAGE);
    }
    
    private void cargarCmbEntrada(){
        for(int i=0; i<10; i++){
            //cmbEntrada.addItem(i);
        }
    }
    
    
}
