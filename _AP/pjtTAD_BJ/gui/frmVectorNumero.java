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
import javax.swing.border.Border;


import cls.*;


public class frmVectorNumero extends JFrame{
    private clsVectorNumero objVNum = new clsVectorNumero();
    private JLabel lblTitulo = new JLabel("Tipo de Datos Abstracto VECTOR NÚMERO");
    private JTable tblSalida;
    private JButton btnDimensionar = new JButton("Dimensionar");
    private JButton btnCargar = new JButton("Cargar");
    private JButton btnCargarRandomico = new JButton("Cargar Randomico");
    private JButton btnObtener = new JButton("Obtener");
    private JButton btnEliminar = new JButton("Eliminar");
    private JButton btnEsta = new JButton("Esta");
    private JButton btnNumerosPares = new JButton("Números pares");
    private JButton btnNumerosImpares = new JButton("Números impares");
    private JButton btnNumerosPrimos = new JButton("Números primos");
    private JButton btnSumar = new JButton("Sumar dos numeros");
    
    private JPanel pnlTabla = new JPanel();
    private JScrollPane splTabla = new JScrollPane();
    //private Border borde = BorderFactory.createRaisedBevelBorder();
    private Border borde = BorderFactory.createLoweredBevelBorder();    
    
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    private JLabel lblSalida = new JLabel("Salida:");
    private JTextField txtSalida = new JTextField();

    private JButton btnCerrar = new JButton("Cerrar");
    
    private clsUtilsGUI mUtils = new clsUtilsGUI();
    
    int frmAncho = 560;
    int frmAlto = 500;
    int pnlAncho = frmAncho-25;
    int pnlAlto = 75;
    
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
        frmVNum.pack();
        frmVNum.setVisible(true);
    }    
    
    
    private void jbInit() throws Exception {
        //frmPrincipal:: Configurarción de las propiedades del Formulario
        getContentPane().setLayout(null);
        setPreferredSize(new Dimension(frmAncho, frmAlto));
        setLocationRelativeTo(null);
        setResizable(false);
        setLocation((screenSize.width-frmAncho)/2, (screenSize.height-frmAlto)/2);  //x, y
        
        setTitle("TAD:: Clase Vector Número");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        //frmPrincipal:: Configuración de las propiedades de los objetos del Formulario
        lblTitulo.setBounds(new Rectangle(0, 5, frmAncho, 30));
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitulo.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));

        //MostrarElementosVector();
        
        tblSalida = new JTable(1, 1);  //fil col
        tblSalida.setPreferredScrollableViewportSize(new Dimension(pnlAncho-15, pnlAlto-35));  //Tamaño de la tabla 470 x 20
        tblSalida.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        AlinearDatosTabla(tblSalida, SwingConstants.CENTER);
        
        splTabla.setViewportView(tblSalida);
        
        pnlTabla.setBorder(borde);
        pnlTabla.setBounds(10, 50, pnlAncho, pnlAlto);  //x,y w,h Tamaño del contenedor de la tabla
        pnlTabla.add(splTabla, null);
        getContentPane().add(pnlTabla, null);  //Adicionando contenedor de la tabla al JFrame

        
        //Object oInput = 9999;
        //tblSalida.setValueAt(oInput, 1, 1);
        //Object oOutput = tblSalida.getValueAt(1,1);
        //txtSalida.setText(oOutput.toString());
                

        btnDimensionar.setBounds(10, 140, 170, 30);
        btnDimensionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnDimensionar_actionPerformed(e);
            }
        });
        
        
        btnCargar.setBounds(190, 140, 170, 30);
        btnCargar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnCargar_actionPerformed(e);
            }
        });
        
        
        btnCargarRandomico.setBounds(370, 140, 170, 30);
        btnCargarRandomico.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnCargarRandomico_actionPerformed(e);
            }
        });
        
        
        btnObtener.setBounds(10, 180, 170, 30);
        btnObtener.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnObtener_actionPerformed(e);
            }
        });        
        
        btnEliminar.setBounds(190, 180, 170, 30);
        btnEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnEliminar_actionPerformed(e);
            }
        });        

        btnEsta.setBounds(370, 180, 170, 30);
        btnEsta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnEsta_actionPerformed(e);
            }
        });     
                
        btnNumerosPares.setBounds(10, 220, 170, 30);
        btnNumerosPares.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnNumerosPares_actionPerformed(e);
            }
        });     
        
        
        btnNumerosImpares.setBounds(190, 220, 170, 30);
        btnNumerosImpares.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnNumerosImpares_actionPerformed(e);
            }
        });     
        
 
        btnNumerosPrimos.setBounds(370, 220, 170, 30);
        btnNumerosPrimos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnNumerosPrimos_actionPerformed(e);
            }
        });     
        

        btnSumar.setBounds(10, 260, 170, 30);
        btnSumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnSumar_actionPerformed(e);
            }
        });          
        
        
        lblSalida.setBounds(10, frmAlto-70, 50, 30);
        txtSalida.setBounds(62, frmAlto-70, 370, 30);
        
       
        btnCerrar.setBounds(frmAncho-120, frmAlto-70, 100, 30);
        btnCerrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnCerrar_actionPerformed(e);
            }
        });
        
       
        getContentPane().add(lblTitulo, null);
        getContentPane().add(pnlTabla, null);
        getContentPane().add(btnDimensionar, null);
        getContentPane().add(btnCargar, null);
        getContentPane().add(btnCargarRandomico, null);
        getContentPane().add(btnObtener, null);
        getContentPane().add(btnEliminar, null);
        getContentPane().add(btnEsta, null);
        getContentPane().add(btnNumerosPares, null);
        getContentPane().add(btnNumerosImpares, null);
        getContentPane().add(btnNumerosPrimos, null);
        getContentPane().add(btnSumar, null);        
        getContentPane().add(lblSalida, null);
        getContentPane().add(txtSalida, null);        
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
        int dim = mUtils.inputbox_Int("Ingresar dimensión vector: ");
        objVNum.CargarRandomico(dim);
        MostrarElementosVector();
        
    }

    
    private void btnObtener_actionPerformed(ActionEvent e) {
        int pos = mUtils.inputbox_Int("Posición a consultar: ");
        long dato = objVNum.getElemento(pos);
        
        if(dato>=0){
            String mostrar = ""+dato;
            mUtils.msgbox(mostrar);
        }else{
            mUtils.msgbox("ERROR:: Posición fuera de rango");
        }
        
    }
    
    
    private void btnEliminar_actionPerformed(ActionEvent e) {
        //txtSalida.setText(objNum.aString());
    }
    
    
    private void btnEsta_actionPerformed(ActionEvent e) {
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
    
    
    
    public void MostrarElementosVector(){
        int k = objVNum.Dimension();
        Object[] col = new Object[1];
        Object[][] fil = new Object[1][1];
        long[] vEle = new long[k];
        
        if(k>0){
            
            
            vEle = objVNum.getElementos();
            col = new Object[k];
            fil = new Object[1][k];
            
            for(int i=0; i<k; i++){
                col[i] = i;
            }
            
            for(int j=0; j<k; j++){
                fil[0][j]= objVNum.getElemento(j);
            }
        }
       
        tblSalida = new JTable(fil, col);  //fil col
        tblSalida.getTableHeader().setFont(new Font("Times New Roman", 1, 16)); //Dialog, SansSerif, Verdana, Cooper Black, Arial
        tblSalida.getTableHeader().setBackground(Color.ORANGE);
        tblSalida.getTableHeader().setForeground(Color.blue);
        tblSalida.setPreferredScrollableViewportSize(new Dimension(pnlAncho-15, pnlAlto-40));  //Tamaño de la tabla 470 x 20 pnlAlto-22
        tblSalida.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        AlinearDatosTabla(tblSalida, SwingConstants.CENTER);

        splTabla.setViewportView(tblSalida);
       
    }
    
    
    //Procedimiento:: Permite alinear los datos de un JTable
    public static void AlinearDatosTabla(JTable table, int alignment)
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
    
    

