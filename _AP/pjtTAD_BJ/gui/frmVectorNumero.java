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
    private JButton btnDimensionar = new JButton("Dimensionar");
    private JButton btnCargar = new JButton("Cargar");
    private JButton btnCargarRandomico = new JButton("Cargar Randomico");
    private JButton btnListarElementos = new JButton("Listar Elementos");
    private JButton btnObtener = new JButton("Obtener");
    private JButton btnEliminar = new JButton("Eliminar");
    private JButton btnNumerosPares = new JButton("Ver números pares");
    private JButton btnNumerosImpares = new JButton("Ver números impares");
    private JButton btnNumerosPrimos = new JButton("Ver números primos");
    private JButton btnSumar = new JButton("Sumar dos numeros");
    
    
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
        int frmAncho = 560;
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
        
        txtEntrada.setBounds(62, 40, 120, 30);
  
        txtSalida.setBounds(62, 80, 430, 30);        
        
        
        
        int k = 20;
        int val = 0;
        
        
        Object[] col = new Object[k];
        
        Object[][] fil = new Object[k][k];
        
        
        for(int i=0; i<k; i++){
            col[i] = i;
            for(int j=0; j<k; j++){
                fil[i][j]= val;
                val++;
            }
        }
        
        
        /**
        for(int j=0; j<k; j++){
            col[j]= j;  //col fil
        }
        
        for(int i=0; i<k; i++){
            fil[0][i]= val;  //col fil
            val++;
        }
    
            
        //JTable tblSalida = new JTable(fil, col);
        
        **/
        tblSalida = new JTable(fil, col);  //fil col
        
        
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
        pnlTabla.setBounds(0, 110, 475, 70);
        
        
        
        //DefaultTableModel model = new DefaultTableModel(fil,col);
        //tblSalida.setPreferredScrollableViewportSize(new Dimension(450,63));
        //tblSalida.setFillsViewportHeight(true);
        
        
        
        //Object oInput = 9999;
        //tblSalida.setValueAt(oInput, 1, 1);
        //Object oOutput = tblSalida.getValueAt(1,1);
        //txtSalida.setText(oOutput.toString());
        
   
        
        
        btnCargar.setBounds(190, 40, 170, 30);
        btnCargar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnCargar_actionPerformed(e);
            }
        });
        
        btnDimensionar.setBounds(370, 40, 170, 30);
        btnDimensionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnDimensionar_actionPerformed(e);
            }
        });
        
        btnCargarRandomico.setBounds(10, 200, 170, 30);
        btnCargar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnCargar_actionPerformed(e);
            }
        });
        
        
        btnObtener.setBounds(190, 200, 170, 30);
        btnObtener.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnObtener_actionPerformed(e);
            }
        });        
        
        btnEliminar.setBounds(370, 200, 170, 30);
        btnEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnEliminar_actionPerformed(e);
            }
        });        
                
        btnNumerosPares.setBounds(10, 240, 170, 30);
        btnNumerosPares.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnNumerosPares_actionPerformed(e);
            }
        });     
        
        btnNumerosImpares.setBounds(190, 240, 170, 30);
        btnNumerosImpares.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnNumerosImpares_actionPerformed(e);
            }
        });     
        
        
        btnNumerosPrimos.setBounds(370, 240, 170, 30);
        btnNumerosPrimos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnNumerosPrimos_actionPerformed(e);
            }
        });     
        

        btnSumar.setBounds(10, 280, 170, 30);
        btnSumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnSumar_actionPerformed(e);
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
        getContentPane().add(btnDimensionar, null);
        getContentPane().add(btnCargar, null);
        getContentPane().add(btnCargarRandomico, null);
        getContentPane().add(btnObtener, null);
        getContentPane().add(btnEliminar, null);
        getContentPane().add(btnNumerosPares, null);
        getContentPane().add(btnNumerosImpares, null);
        getContentPane().add(btnNumerosPrimos, null);
        getContentPane().add(btnSumar, null);        
        
        
        getContentPane().add(btnCerrar, null);
        
    }
    
    private void btnDimensionar_actionPerformed(ActionEvent e) {           
        //long iNum = Long.parseLong(txtEntrada.getText());
        //objNum.setNumero(iNum);
        //txtSalida.setText("");
    }
        
    private void btnCargar_actionPerformed(ActionEvent e) {           
        //long iNum = Long.parseLong(txtEntrada.getText());
        //objNum.setNumero(iNum);
        //txtSalida.setText("");
    }
    
    private void btnCargarRandomico_actionPerformed(ActionEvent e) {
        //txtSalida.setText(""+(objNum.DigitosPares()));
    }

    private void btnObtener_actionPerformed(ActionEvent e) {
        //txtSalida.setText(objNum.aString());
    }
    
    private void btnEliminar_actionPerformed(ActionEvent e) {
        //txtSalida.setText(objNum.aString());
    }
    
    private void btnNumerosPares_actionPerformed(ActionEvent e) {
        //txtSalida.setText(""+(objNum.DigitosPares()));
    }
    
    private void btnNumerosImpares_actionPerformed(ActionEvent e) {
        //txtSalida.setText(""+(objNum.DigitosPares()));
    }
    
    private void btnNumerosPrimos_actionPerformed(ActionEvent e) {
        //txtSalida.setText(""+(objNum.DigitosPares()));
    }
    
    
    private void btnSumar_actionPerformed(ActionEvent e) {
        byte x = mUtils.inputbox_Byte("x: ");
        byte y = mUtils.inputbox_Byte("y: ");
        int z= x + y;
        String mostrar = x + " + " + y + " = " + z;
        mUtils.msgbox(mostrar);
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
    
    

