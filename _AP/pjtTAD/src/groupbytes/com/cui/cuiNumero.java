package groupbytes.com.cui;

import groupbytes.com.hdl.hdlNumero;

public class cuiNumero {
    private  static clsUtils mUtil = new clsUtils();
    private static hdlNumero objNumero = new hdlNumero();

    //Implementación del procedimiento principal MAIN
    //Interfaz del Usuario (runner)
    public static void main (String[] args){
        mostrar_menu();
        elegir_opcion();
    }


    public static void mostrar_menu (){
        mUtil.LimpiarPantalla();
        System.out.print("---- CLASE NÚMERO ----\n\n");

        System.out.print("\t[A] Cargar\n");
        System.out.print("\t[B] Mostrar\n");
        System.out.print("\t[C] Mostrar dígitos pares\n");
        System.out.print("\t[D] Mostrar dígitos impares\n");
        System.out.print("\t[E] Cantidad digitos\n");
        System.out.print("\t[F] Cantidad dígitos pares\n");
        System.out.print("\t[G] Cantidad dígitos impares\n");
        System.out.print("\t[H] Teorema de la numeración\n");
        System.out.print("\t[I] Posición a consultar\n");

        System.out.print("\t[S] Salir\n");

        System.out.print("\n");
    }


    public static void elegir_opcion (){
        int iNum;
        int k;

        char cOpcion = mUtil.get_Letra("Elija una opción: ");

        switch(cOpcion){
            case 'A':
                iNum = mUtil.get_Int("Introduzca un numero: ");
                objNumero.CargarNumero(iNum);
                break;
            case 'B':
                objNumero.MostrarNumero();
                break;
            case 'C':
                objNumero.MostrarDigitosPares();
                break;
            case 'D':
                objNumero.MostrarDigitosImpares();
                break;
            case 'E':
                objNumero.CantidadDigitos();
                break;
            case 'F':
                objNumero.MostrarCantidadDigitosPares();
                break;
            case 'G':
                objNumero.MostrarCantidadDigitosImpares();
                break;
            case 'H':
                objNumero.TeoremaNumeracion();
                break;
            case 'I':
                byte yPos = mUtil.get_Byte("Introduzca la posición a consultar: ");
                objNumero.MostrarDigitoPosicion(yPos);
                break;




            case 'S':
                mUtil.LimpiarPantalla();
                System.exit(0);
                break;
            default:
                System.out.print("ERROR:: Opción no disponible...");
                break;
        }

        System.out.print("\n");
        java.util.Scanner entrada = new java.util.Scanner(System.in);
        String sEntrada = entrada.next();
        main(null);
    }

    
}