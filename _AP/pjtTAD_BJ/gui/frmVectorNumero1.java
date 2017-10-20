package gui;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;

import java.awt.Dimension;

public class frmVectorNumero1{
    
    public static void main(String[] args) {
        new frmVectorNumero1();
    }
  
    public frmVectorNumero1(){
        JFrame frame = new JFrame();
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        
        
        
        
        int frmAncho = 515;
        int frmAlto = 600;

        //frmPrincipal:: Configurarción de las propiedades del Formulario
        //frame.getContentPane().setLayout(null);
        frame.setSize(frmAncho, frmAlto);
        frame.setTitle("TAD:: Clase Vector Número");
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        
        
        //frame.setUndecorated(true);
        //frame.getRootPane().setWindowDecorationStyle(JRootPane.PLAIN_DIALOG);
        //frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        int k = 200;
        int val = 0;
        
        Object[][] fil = new Object[k][k];
        Object[] col = new Object[k];
                
        for(int i=0; i<k; i++){
            col[i] = i;
            for(int j=0; j<k; j++){
                fil[i][j]= val;
                val++;
            }
        }
        

       
        JTable tblSalida = new JTable(fil,col);
        //tblSalida.setBounds(new Rectangle(0, 5, 100, 50));
        //tblSalida.setBounds(10, 40, 50, 30);
        tblSalida.setSize(new Dimension(50,63));
        tblSalida.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        JTableHeader header = tblSalida.getTableHeader();
        header.setBackground(Color.yellow);
        
        JScrollPane pane = new JScrollPane(tblSalida);
        pane.setSize(new Dimension(50,63));
        
        
        panel1.setBounds(new Rectangle(0, 5, 100, 50));
        panel1.setBounds(10, 40, 50, 30);
        //panel.setSize(new Dimension(50,63));
        panel1.add(pane);
        panel2.add(panel1);
        
        
        frame.add(panel2);
        frame.setVisible(true);
    }
    
    
    
}