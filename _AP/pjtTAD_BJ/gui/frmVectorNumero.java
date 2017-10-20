package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import java.awt.Dimension;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.SwingConstants;

import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.*;


import cls.*;


public class frmVectorNumero extends JFrame{
    private clsVectorNumero objVNum = new clsVectorNumero();
    private JLabel lblTitulo = new JLabel("Tipo de Datos Abstracto VECTOR NÚMERO");
    private JLabel lblEntrada = new JLabel("Entrada:");
    private JLabel lblSalida = new JLabel("Salida:");
    private JTextField txtEntrada = new JTextField();
    private JTextField txtSalida = new JTextField();
    private JTable tblSalida;
    private JButton btnCargar = new JButton("Cargar");
    private JButton btnObtener = new JButton("Obtener");
    private JButton btnNumerosPares = new JButton("Ver números pares");
    
    
    //private JFrame frame = new JFrame("VECTOR");
    private JPanel pnlTabla = new JPanel();
    
    
    
    private JButton btnCerrar = new JButton("Cerrar");
    
    private clsUtilsGUI mUtils = new clsUtilsGUI();
    
    
    
    //Constructor
    public frmVectorNumero() {
        try {
            objVNum = new clsVectorNumero();
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    //Runner
    public static void main(String[] args) {
        frmVectorNumero frmVNum = new frmVectorNumero();
        frmVNum.setVisible(true);
    }    
    
    
    
    
    private void jbInit() throws Exception {
        int frmAncho = 515;
        int frmAlto = 500;

        //frmPrincipal:: Configurarción de las propiedades del Formulario
        getContentPane().setLayout(null);
        setSize(frmAncho, frmAlto);
        setTitle("TAD:: Clase Vector Número");
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        
        //frmPrincipal:: Configuración de las propiedades de los objetos del Formulario
        lblTitulo.setBounds(new Rectangle(0, 5, frmAncho, 30));
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitulo.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));

        
                
        lblEntrada.setBounds(10, 40, 50, 30);
        
        lblSalida.setBounds(10, 80, 50, 30);
        
        txtEntrada.setBounds(62, 40, 320, 30);
  
        txtSalida.setBounds(62, 80, 430, 30);        
        
        
        
        int k = 10;
        int val = 0;
        
        Object[][] fil = new Object[k][k];
        Object[] col = new Object[k];
                
        for(int i=0; i<k; i++){
            col[i] = i;
            for(int j=0; j<10; j++){
                fil[i][j]= val;
                val++;
            }
        }
        
        //JTable tblSalida = new JTable(fil, col);
        tblSalida = new JTable(fil, col);
        
        
        JScrollPane sclTabla = new JScrollPane(tblSalida);
        sclTabla.setViewportView(tblSalida);
        
              
        
        tblSalida.getTableHeader().setFont(new Font("Times New Roman", 1, 16)); //Dialog, SansSerif, Verdana, Cooper Black, Arial
        tblSalida.getTableHeader().setBackground(Color.ORANGE);
        tblSalida.getTableHeader().setForeground(Color.blue);
        tblSalida.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        
        //int i = tblSalida.getColumnCount();
        //System.out.println(i);
        
        //Alinea una columna de la JTable
        //DefaultTableCellRenderer Alinear = new DefaultTableCellRenderer(); 
        //Alinear.setHorizontalAlignment(SwingConstants.CENTER);//.LEFT .RIGHT .CENTER
        //tblSalida.getColumnModel().getColumn(2).setCellRenderer(Alinear);
        
        
        
        setCellsAlignment(tblSalida, SwingConstants.CENTER);
        
        
        //DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        //tcr.setHorizontalAlignment(SwingConstans.CENTER);
        //tblSalida.getColumnModel().getColumn(column).setCellRenderer(tcr);
        
        
        //JTableHeader encabezado = tblSalida.getTableHeader();
        //encabezado.setBackground(Color.ORANGE);
        //encabezado.setForeground(Color.blue);
        //ttblSalida.getTableHeader().
        //encabezado.setFont(new Font("Verdana", Font.BOLD, 12)); 
        //JScrollPane sclTabla = new JScrollPane(tblSalida);
        //tblSalida.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        
        
        //Object[] nombrecolumnas = {"Nombre", "Apellido", "Edad"};
        //Object[][] datos ={{"Nombre1", "Apellido1", 22},{"Nombre2", "Apellido2", 4}};
        //JTable tabla = new JTable(datos,nombrecolumnas);
        //Jframe.add(tabla);
        //getContentPane().add(tabla, null);
        
        //JScrollPane sclTabla1 = new JScrollPane(tblSalida);
        sclTabla.setViewportView(tblSalida);
        
        pnlTabla.add(sclTabla);
        //pnlTabla.add(tabla);
        
        
        
        //tblSalida.setBounds(10, 110, 490, 70);
        //pnlTabla.add(tblSalida);
        pnlTabla.setBounds(0, 110, 500, 70);
        
        
        
        //DefaultTableModel model = new DefaultTableModel(fil,col);
        //tblSalida.setPreferredScrollableViewportSize(new Dimension(450,63));
        //tblSalida.setFillsViewportHeight(true);
        
        
        
        //Object oInput = 9999;
        //tblSalida.setValueAt(oInput, 1, 1);
        //Object oOutput = tblSalida.getValueAt(1,1);
        //txtSalida.setText(oOutput.toString());
        
   
        

        
        
        
        btnCargar.setBounds(390, 40, 100, 30);
        btnCargar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnCargar_actionPerformed(e);
            }
        });
        
        btnObtener.setBounds(10, 200, 150, 30);
        btnObtener.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnObtener_actionPerformed(e);
            }
        });        
                
        btnNumerosPares.setBounds(170, 200, 150, 30);
        btnNumerosPares.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnNumerosPares_actionPerformed(e);
            }
        });     
        
        

        
        btnCerrar.setBounds(getWidth()-120, (getHeight()-70), 100, 30);
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
        getContentPane().add(txtSalida, null);
        //getContentPane().add(tblSalida, null);
        getContentPane().add(pnlTabla, null);
        getContentPane().add(btnCargar, null);
        getContentPane().add(btnObtener, null);
        getContentPane().add(btnNumerosPares, null);
        
        getContentPane().add(btnCerrar, null);
        
    }
    
    
    private void btnCargar_actionPerformed(ActionEvent e) {           
        //long iNum = Long.parseLong(txtEntrada.getText());
        //objNum.setNumero(iNum);
        //txtSalida.setText("");
    }
    
    private void btnObtener_actionPerformed(ActionEvent e) {
        //txtSalida.setText(objNum.aString());
    }
    
    private void btnNumerosPares_actionPerformed(ActionEvent e) {
        //txtSalida.setText(""+(objNum.DigitosPares()));
    }
    
    
    
    
    
    private void btnCerrar_actionPerformed(ActionEvent e) {
        dispose();
    }
    
    
    
    //Procedimiento:: Permite alinear los datos de un JTable
    public static void setCellsAlignment(JTable table, int alignment)
    {
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(alignment);
        TableModel tableModel = table.getModel();

        for (int columnIndex = 0; columnIndex < tableModel.getColumnCount(); columnIndex++)
        {
            table.getColumnModel().getColumn(columnIndex).setCellRenderer(rightRenderer);
        }
    }
    

}
    
    

