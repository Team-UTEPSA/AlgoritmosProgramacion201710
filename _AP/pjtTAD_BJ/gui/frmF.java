package gui;


import javax.swing.*;
import java.awt.*;
import javax.swing.table.TableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.border.Border;


public class frmF extends JFrame {
    private JPanel pnlTabla = new JPanel();
    private JScrollPane splTabla = new JScrollPane();
    private JTable tblSalida;
    //private Border borde = BorderFactory.createRaisedBevelBorder();
    private Border borde = BorderFactory.createLoweredBevelBorder();
    
    
    //Constructor
    public frmF() {
        try {
            frmIni();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    public static void main(String[] args) {
        frmF frmA = new frmF();
        frmA.pack();
        frmA.setVisible(true);
    }    
    
    
    private void frmIni() throws Exception {
        int frmAncho = 560;
        int frmAlto = 500;
        int pnlAncho = frmAncho-50;
        int pnlAlto = 75;

        //frmPrincipal:: Configurarción de las propiedades del Formulario
        getContentPane().setLayout(null);
        setSize(frmAncho, frmAlto);
        setTitle("TAD:: Clase Vector Número");
        setLocationRelativeTo(null);
        //setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        int k = 20;
        int val = 0;
        
        Object[] col = new Object[k];
        Object[][] fil = new Object[1][k];
        
        for(int i=0; i<k; i++){
            col[i] = i;
        }
        
        for(int j=0; j<k; j++){
            fil[0][j]= j;  //fil / col
        }
        
        
        tblSalida = new JTable(fil, col);  //fil col
        tblSalida.getTableHeader().setFont(new Font("Times New Roman", 1, 16)); //Dialog, SansSerif, Verdana, Cooper Black, Arial
        tblSalida.getTableHeader().setBackground(Color.ORANGE);
        tblSalida.getTableHeader().setForeground(Color.blue);
        tblSalida.setPreferredScrollableViewportSize(new Dimension(pnlAncho-15, pnlAlto-52));  //Tamaño de la tabla 470 x 20
        tblSalida.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        setCellsAlignment(tblSalida, SwingConstants.CENTER);

        splTabla.setViewportView(tblSalida);
            
        pnlTabla.setBorder(borde);
        pnlTabla.setBounds(10, 100, pnlAncho, pnlAlto);  //x,y w,h Tamaño del contenedor de la tabla
        pnlTabla.add(splTabla, null);
        getContentPane().add(pnlTabla, null);  //Adicionando contenedor de la tabla al JFrame

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