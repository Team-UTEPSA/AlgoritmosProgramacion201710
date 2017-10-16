package cui;

import hdl.hdlNumero;

public class cuiNumero {
    private  static clsUtils mUtil = new clsUtils();
    private static hdlNumero hdlNum = new hdlNumero();

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
        System.out.print("\t[I] Consultar digito en Posición\n");
        System.out.print("\t[J] Digito mayor\n");
        System.out.print("\t[K] Contar Digito\n");
        System.out.print("\t[L] Es primo\n");




        System.out.print("\t[S] Salir\n");
        System.out.print("\n");
    }


    public static void elegir_opcion (){
        long iNum;

        char cOpcion = mUtil.get_Opcion("Elija una opción: ");
        System.out.print("\n");

        switch(cOpcion){
            case 'A':
                iNum = mUtil.get_Long("Introduzca un numero: ");
                hdlNum.CargarNumero(iNum);
                break;
            case 'B':
                hdlNum.MostrarNumero();
                break;
            case 'C':
                hdlNum.MostrarDigitosPares();
                break;
            case 'D':
                hdlNum.MostrarDigitosImpares();
                break;
            case 'E':
                hdlNum.CantidadDigitos();
                break;
            case 'F':
                hdlNum.MostrarCantidadDigitosPares();
                break;
            case 'G':
                hdlNum.MostrarCantidadDigitosImpares();
                break;
            case 'H':
                hdlNum.TeoremaNumeracion();
                break;
            case 'I':
                byte yPos = mUtil.get_Byte("Introduzca la posición a consultar: ");
                hdlNum.MostrarDigitoPosicion(yPos);
                break;
            case 'J':
                hdlNum.MostrarDigitoMayor();
                break;
            case 'K':
                byte yCant = mUtil.get_Byte("Digito a contar: ");
                hdlNum.MostrarCantidadDigitos(yCant);
                break;
            case 'L':
                hdlNum.NumeroEsPrimo();
                break;



            case 'S':
                mUtil.LimpiarPantalla();
                System.exit(0);
                break;
            default:
                System.out.print("ERROR:: Opción no disponible...");
                break;
        }

        System.out.print("\n\n");
        cOpcion = mUtil.get_Opcion("[S] Salir: ");
        main(null);
    }

    
}