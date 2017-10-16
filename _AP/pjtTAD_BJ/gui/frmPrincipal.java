package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class frmPrincipal extends JFrame {
    private JLabel lblTitulo = new JLabel("TIPO DE DATOS ABSTRACTOS (TAD/ADT)");
    private JButton btnClaseDigito = new JButton("Digito");
    private JButton btnClaseCaracter = new JButton("Caracter");
    private JButton btnClaseNumero = new JButton("Numero");
    private JButton btnClaseCadena = new JButton("Cadena");
    private JButton btnClaseVectorNumero = new JButton("Vector Numero");
    private JButton btnClaseVectorCadena = new JButton("Vector Cadena");
    private JButton btnClaseMatrizNumero = new JButton("Matriz Numero");
    private JButton btnClaseMatrizCadena = new JButton("Matriz Cadena");
    private JButton btnClaseColaNumero = new JButton("Cola Numero");
    private JButton btnClaseColaCadena = new JButton("Cola Cadena");
    private JButton btnClasePilaNumero = new JButton("Pila Numero");
    private JButton btnClasePilaCadena = new JButton("Pila Cadena");
    private JButton btnClaseRondaNumero = new JButton("Ronda Numero");
    private JButton btnClaseRondaCadena = new JButton("Ronda Cadena");
    private JButton btnClaseArbolNumero = new JButton("Arbol Numero");
    private JButton btnClaseArbolCadena = new JButton("Arbol Cadena");
    
    
    private JButton btnClaseArchivoTexto = new JButton("Archivo Texto");
    private JButton btnClaseArchivoBinario = new JButton("Archivo Binario");
    private JButton btnClaseArchivoXML = new JButton("Archivo XML");
    private JButton btnClaseArchivoJSON = new JButton("Archivo JSON");
    private JButton btnACercaDe = new JButton("A cerca de...");
    private JButton btnSalir = new JButton("Salir");


    //Constructor
    public frmPrincipal() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //Runner
    public static void main(String[] args) {
        frmPrincipal frmP = new frmPrincipal();
        frmP.setVisible(true);
    }


    private void jbInit() throws Exception {
        int frmAncho = 515;
        int frmAlto = 500;

        int btnPosX = 20;
        int btnPosY = 50;
        int btnAncho = 150;
        int btnAlto = 30;
        int btnEspacio = 10;


        //frmPrincipal:: Configurarción de las propiedades del Formulario
        getContentPane().setLayout(null);
        setSize(frmAncho,frmAlto);
        setTitle("Group Bytes - Tipo de Dato Abstracto v0.01");
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //frmPrincipal:: Configuración de las propiedades de los objetos del Formulario
        lblTitulo.setBounds(new Rectangle(0, 5, frmAncho, 30));
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitulo.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));

        btnClaseDigito.setBounds(new Rectangle(btnPosX, btnPosY , btnAncho, btnAlto));
        btnClaseDigito.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnClaseDigito_actionPerformed(e);
            }
        });

        btnClaseCaracter.setBounds(new Rectangle((btnPosX+btnEspacio*16), btnPosY, btnAncho, btnAlto));
        btnClaseCaracter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnClaseCaracter_actionPerformed(e);
            }
        });

        btnClaseNumero.setBounds(new Rectangle(btnPosX, (btnPosY+btnEspacio*4), btnAncho, btnAlto));
        btnClaseNumero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnClaseNumero_actionPerformed(e);
            }
        });

        btnClaseCadena.setBounds(new Rectangle((btnPosX+btnEspacio*16), (btnPosY+btnEspacio*4), btnAncho, btnAlto));
        btnClaseCadena.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnClaseCadena_actionPerformed(e);
            }
        });

        btnClaseVectorNumero.setBounds(new Rectangle(btnPosX, (btnPosY+btnEspacio*8), btnAncho, btnAlto));
        btnClaseVectorNumero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnClaseVectorNumero_actionPerformed(e);
            }
        });

        btnClaseVectorCadena.setBounds(new Rectangle((btnPosX+btnEspacio*16), (btnPosY+btnEspacio*8), btnAncho, btnAlto));
        btnClaseVectorCadena.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnClaseVectorCadena_actionPerformed(e);
            }
        });

        btnClaseMatrizNumero.setBounds(new Rectangle(btnPosX, (btnPosY+btnEspacio*12), btnAncho, btnAlto));
        btnClaseMatrizNumero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnClaseMatrizNumero_actionPerformed(e);
            }
        });

        btnClaseMatrizCadena.setBounds(new Rectangle((btnPosX+btnEspacio*16), (btnPosY+btnEspacio*12), btnAncho, btnAlto));
        btnClaseMatrizCadena.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnClaseMatrizCadena_actionPerformed(e);
            }
        });

        btnClaseColaNumero.setBounds(new Rectangle(btnPosX, (btnPosY+btnEspacio*16), btnAncho, btnAlto));
        btnClaseColaNumero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnClaseColaNumero_actionPerformed(e);
            }
        });

        btnClaseColaCadena.setBounds(new Rectangle((btnPosX+btnEspacio*16), (btnPosY+btnEspacio*16), btnAncho, btnAlto));
        btnClaseColaCadena.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnClaseColaCadena_actionPerformed(e);
            }
        });

        btnClasePilaNumero.setBounds(new Rectangle(btnPosX, (btnPosY+btnEspacio*20), btnAncho, btnAlto));
        btnClasePilaNumero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnClasePilaNumero_actionPerformed(e);
            }
        });

        btnClasePilaCadena.setBounds(new Rectangle((btnPosX+btnEspacio*16), (btnPosY+btnEspacio*20), btnAncho, btnAlto));
        btnClasePilaCadena.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnClasePilaCadena_actionPerformed(e);
            }
        });

        btnClaseRondaNumero.setBounds(new Rectangle(btnPosX, (btnPosY+btnEspacio*24), btnAncho, btnAlto));
        btnClaseRondaNumero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnClaseRondaNumero_actionPerformed(e);
            }
        });

        btnClaseRondaCadena.setBounds(new Rectangle((btnPosX+btnEspacio*16), (btnPosY+btnEspacio*24), btnAncho, btnAlto));
        btnClaseRondaCadena.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnClaseRondaCadena_actionPerformed(e);
            }
        });

        btnClaseArbolNumero.setBounds(new Rectangle(btnPosX, (btnPosY+btnEspacio*28), btnAncho, btnAlto));
        btnClaseArbolNumero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnClaseArbolNumero_actionPerformed(e);
            }
        });

        btnClaseArbolCadena.setBounds(new Rectangle((btnPosX+btnEspacio*16), (btnPosY+btnEspacio*28), btnAncho, btnAlto));
        btnClaseArbolCadena.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnClaseArbolCadena_actionPerformed(e);
            }
        });

        btnClaseArchivoTexto.setBounds(new Rectangle((btnPosX+btnEspacio*32), btnPosY , btnAncho, btnAlto));
        btnClaseArchivoTexto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnClaseArchivoTexto_actionPerformed(e);
            }
        });

        btnClaseArchivoBinario.setBounds(new Rectangle((btnPosX+btnEspacio*32), (btnPosY+btnEspacio*4), btnAncho, btnAlto));
        btnClaseArchivoBinario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnClaseArchivoBinario_actionPerformed(e);
            }
        });

        btnClaseArchivoXML.setBounds(new Rectangle((btnPosX+btnEspacio*32), (btnPosY+btnEspacio*8), btnAncho, btnAlto));
        btnClaseArchivoXML.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnClaseArhivoXML_actionPerformed(e);
            }
        });

        btnClaseArchivoJSON.setBounds(new Rectangle((btnPosX+btnEspacio*32), (btnPosY+btnEspacio*12), btnAncho, btnAlto));
        btnClaseArchivoJSON.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnClaseArhivoJSON_actionPerformed(e);
            }
        });

        btnACercaDe.setBounds(new Rectangle((btnPosX+btnEspacio*16), (getHeight()-70), btnAncho, btnAlto));
        btnACercaDe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnAcercaDe_actionPerformed(e);
            }
        });

        btnSalir.setBounds(new Rectangle((btnPosX+btnEspacio*32), (getHeight()-70), btnAncho, btnAlto));
        btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnSalir_actionPerformed(e);
            }
        });


        //frmFormulario:: Adicionar de Objetos al Panel
        getContentPane().add(lblTitulo, null);
        getContentPane().add(btnClaseDigito, null);
        getContentPane().add(btnClaseCaracter, null);
        getContentPane().add(btnClaseNumero, null);
        getContentPane().add(btnClaseCadena, null);
        getContentPane().add(btnClaseVectorNumero, null);
        getContentPane().add(btnClaseVectorCadena, null);
        getContentPane().add(btnClaseMatrizNumero, null);
        getContentPane().add(btnClaseMatrizCadena, null);
        getContentPane().add(btnClaseColaNumero, null);
        getContentPane().add(btnClaseColaCadena, null);
        getContentPane().add(btnClasePilaNumero, null);
        getContentPane().add(btnClasePilaCadena, null);
        getContentPane().add(btnClaseRondaNumero, null);
        getContentPane().add(btnClaseRondaCadena, null);
        getContentPane().add(btnClaseArbolNumero, null);
        getContentPane().add(btnClaseArbolCadena, null);
        getContentPane().add(btnClaseArchivoTexto, null);
        getContentPane().add(btnClaseArchivoBinario, null);
        getContentPane().add(btnClaseArchivoXML, null);
        getContentPane().add(btnClaseArchivoJSON, null);
        getContentPane().add(btnACercaDe, null);
        getContentPane().add(btnSalir, null);
    }


    //frmPrincipal:: Implementaciones de eventos de los objetos
    private void btnClaseDigito_actionPerformed(ActionEvent e) {
        frmDigito frmDig = new frmDigito();
        frmDig.setVisible(true);
    }

    private void btnClaseCaracter_actionPerformed(ActionEvent e) {
        System.out.println("Clic en Clase Caracter");
    }

    private void btnClaseNumero_actionPerformed(ActionEvent e) {
        System.out.println("Clic en Clase Numero");
    }

    private void btnClaseCadena_actionPerformed(ActionEvent e) {
        System.out.println("Clic en Clase Cadena");
    }

    private void btnClaseVectorNumero_actionPerformed(ActionEvent e) {
        System.out.println("Clic en Clase Vector Numero");
    }

    private void btnClaseVectorCadena_actionPerformed(ActionEvent e) {
        System.out.println("Clic en Clase Vector Cadena");
    }

    private void btnClaseMatrizNumero_actionPerformed(ActionEvent e) {
        System.out.println("Clic en Clase Matriz Numero");
    }

    private void btnClaseMatrizCadena_actionPerformed(ActionEvent e) {
        System.out.println("Clic en Clase Matriz Cadena");
    }

    private void btnClaseColaNumero_actionPerformed(ActionEvent e) {
        System.out.println("Clic en Clase Cola Numero");
    }

    private void btnClaseColaCadena_actionPerformed(ActionEvent e) {
        System.out.println("Clic en Clase Cola Cadena");
    }

    private void btnClasePilaNumero_actionPerformed(ActionEvent e) {
        System.out.println("Clic en Clase Pila Numero");
    }

    private void btnClasePilaCadena_actionPerformed(ActionEvent e) {
        System.out.println("Clic en Clase Pila Cadena");
    }

    private void btnClaseRondaNumero_actionPerformed(ActionEvent e) {
        System.out.println("Clic en Clase Ronda Numero");
    }

    private void btnClaseRondaCadena_actionPerformed(ActionEvent e) {
        System.out.println("Clic en Clase Ronda Cadena");
    }

    private void btnClaseArbolNumero_actionPerformed(ActionEvent e) {
        System.out.println("Clic en Clase Arbol Numero");
    }

    private void btnClaseArbolCadena_actionPerformed(ActionEvent e) {
        System.out.println("Clic en Clase Arbol Cadena");
    }

    private void btnClaseArchivoTexto_actionPerformed(ActionEvent e) {
        System.out.println("Clic en Clase Archivo Texto");
    }

    private void btnClaseArchivoBinario_actionPerformed(ActionEvent e) {
        System.out.println("Clic en Clase Archivo Binario");
    }

    private void btnClaseArhivoXML_actionPerformed(ActionEvent e) {
        System.out.println("Clic en Clase Archivo XML");
    }

    private void btnClaseArhivoJSON_actionPerformed(ActionEvent e) {
        System.out.println("Clic en Clase Archivo JSON");
    }

    private void btnAcercaDe_actionPerformed(ActionEvent e) {
        showDialog();
    }

    private void btnSalir_actionPerformed(ActionEvent e) {
        System.exit( 0 );
    }


    private void showDialog()
    {
        JDialog frmDlg = new JDialog(this, Dialog.ModalityType.APPLICATION_MODAL);
        JTextArea txtContenido = new JTextArea();

        frmDlg.setSize(350,250);
        frmDlg.setLocationRelativeTo(null);
        frmDlg.setTitle("Group Bytes - Consultoría Informática");
        txtContenido.setText("\nUniversidad: UTEPSA\n\n" +
                "Materia: Algorítmos y Programación\n\n" +
                "Grupo: T");
        txtContenido.setLineWrap(true);
        txtContenido.setEditable(false);
               
        frmDlg.setContentPane(txtContenido);
        
        frmDlg.setVisible(true);
    }

}








