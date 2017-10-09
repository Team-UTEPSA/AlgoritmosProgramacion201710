package groupbytes.com.cui;

import groupbytes.com.hdl.hdlDigito;

public class cuiDigito {
    private  static clsUtils mUtil = new clsUtils();
    private static hdlDigito hdlDig = new hdlDigito();

    //Implementación del procedimiento principal MAIN
    //Interfaz del Usuario (runner)
    public static void main (String[] args){
        mostrar_menu();
        elegir_opcion();
    }


    public static void mostrar_menu (){
        mUtil.LimpiarPantalla();
        System.out.print("---- CLASE DIGITO ----\n\n");

        System.out.print("\t[A] Cargar\n");
        System.out.print("\t[B] Mostrar\n");
        System.out.print("\t[C] XXX\n");
        System.out.print("\t[D] XXX\n");
        System.out.print("\t[E] XXX\n");
        System.out.print("\t[F] XXX\n");
        System.out.print("\t[G] XXX\n");
        System.out.print("\t[H] XXX\n");
        System.out.print("\t[I] XXX\n");
        System.out.print("\t[J] XXX\n");
        System.out.print("\t[K] XXX\n");
        System.out.print("\t[L] XXX\n");
        System.out.print("\t[M] XXX\n");
        System.out.print("\t[N] XXX\n");
        System.out.print("\t[O] XXX\n");
        System.out.print("\t[P] XXX\n");
        System.out.print("\t[Q] XXX\n");

        System.out.print("\t[S] Salir\n");
        System.out.print("\n");
    }


    public static void elegir_opcion (){
        byte yDig;

        char cOpcion = mUtil.get_Opcion("Elija una opción: ");
        System.out.print("\n");

        switch(cOpcion){
            case 'A':
                yDig = mUtil.get_Byte("Introduzca un dígito: ");
                hdlDig.CargarDigito(yDig);
                break;
            case 'B':
                hdlDig.MostrarDigito();
                break;
            case 'C':
                //hdlDig.();
                break;
            case 'D':
                //hdlDig.();
                break;
            case 'E':
                //hdlDig.();
                break;
            case 'F':
                //hdlDig.();
                break;
            case 'G':
                //hdlDig.();
                break;
            case 'H':
                //hdlDig.();
                break;
            case 'I':
                //hdlDig.();
                break;
            case 'J':
                //hdlDig.();
                break;
            case 'K':
                //hdlDig.();
                break;
            case 'L':
                //hdlDig.();
                break;



            case 'S':
                mUtil.LimpiarPantalla();
                System.exit(0);
                break;
            default:
                System.out.print("ERROR:: Opción no disponible...\n");
                break;
        }

        System.out.print("\n\n");
        cOpcion = mUtil.get_Opcion("[S] Salir: ");
        main(null);
    }


}
