 
 
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
 
public class Frame extends javax.swing.JFrame {
    
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCentro;
    private javax.swing.JButton btnDerecha;
    private javax.swing.JButton btnIzquierda;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable miTabla;
 
    DefaultTableModel modeloTabla;
    DefaultTableCellRenderer alinearCentro, alinearDerecha, alinearIzquierda;
 
    public Frame() {
        asignarModeloTabla();
        inicializarRenderers();
        initComponents();
    }
 
    private void asignarModeloTabla(){
        modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("Codigo");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Sueldo");
    }
 
    private void inicializarRenderers(){
         alinearCentro = new DefaultTableCellRenderer();
         alinearCentro.setHorizontalAlignment(SwingConstants.CENTER);
 
         alinearDerecha = new DefaultTableCellRenderer();
         alinearDerecha.setHorizontalAlignment(SwingConstants.RIGHT);
 
         alinearIzquierda = new DefaultTableCellRenderer();
         alinearIzquierda.setHorizontalAlignment(SwingConstants.LEFT);
    }
 
    private void initComponents() {
 
        jScrollPane1 = new javax.swing.JScrollPane();
        miTabla = new javax.swing.JTable();
        btnCentro = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnIzquierda = new javax.swing.JButton();
        btnDerecha = new javax.swing.JButton();
 
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
 
        miTabla.setModel(modeloTabla);
        jScrollPane1.setViewportView(miTabla);
 
        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);
 
        btnCentro.setText("Centrar");
        btnCentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCentroActionPerformed(evt);
            }
        });
        getContentPane().add(btnCentro, java.awt.BorderLayout.PAGE_END);
 
        btnAgregar.setText("Agregar fila");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, java.awt.BorderLayout.PAGE_START);
 
        btnIzquierda.setText("Izquierda");
        btnIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzquierdaActionPerformed(evt);
            }
        });
        getContentPane().add(btnIzquierda, java.awt.BorderLayout.LINE_START);
 
        btnDerecha.setText("Derecha");
        btnDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDerechaActionPerformed(evt);
            }
        });
        getContentPane().add(btnDerecha, java.awt.BorderLayout.LINE_END);
 
        pack();
    }
 
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {
        modeloTabla.addRow(new Object[]{"01", "usuario", "4,251.25"});
    }
 
    private void btnCentroActionPerformed(java.awt.event.ActionEvent evt) {
        miTabla.getColumnModel().getColumn(2).setCellRenderer(alinearCentro);
    }
 
    private void btnIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {
        miTabla.getColumnModel().getColumn(2).setCellRenderer(alinearIzquierda);
    }
 
    private void btnDerechaActionPerformed(java.awt.event.ActionEvent evt) {
        miTabla.getColumnModel().getColumn(2).setCellRenderer(alinearDerecha);
    }
 
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Frame miMarco = new Frame();
                miMarco.setVisible(true);
                miMarco.setLocationRelativeTo(null);
            }
        });
    }
}