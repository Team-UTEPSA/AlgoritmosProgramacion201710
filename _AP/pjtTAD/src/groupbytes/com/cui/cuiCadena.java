package groupbytes.com.cui;

import groupbytes.com.hdl.hdlCadena;

public class cuiCadena {
    private  static clsUtils mUtil = new clsUtils();
    private static hdlCadena hdlCad = new hdlCadena();

    //Implementación del procedimiento principal MAIN
    //Interfaz del Usuario (runner)
    public static void main (String[] args){
        mostrar_menu();
        elegir_opcion();
    }


    public static void mostrar_menu (){
        mUtil.LimpiarPantalla();
        System.out.print("---- CLASE CADENA ----\n\n");

        System.out.print("\t[A] Cargar\n");
        System.out.print("\t[B] Mostrar\n");
        System.out.print("\t[C] Dimensión\n");
        System.out.print("\t[D] Convertir en Mayúscula\n");
        System.out.print("\t[E] Convertir en Minúscula\n");
        System.out.print("\t[F] Primera Letra en Mayúscula\n");
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
        String sCad;

        char cOpcion = mUtil.get_Opcion("Elija una opción: ");
        System.out.print("\n");

        switch(cOpcion){
            case 'A':
                sCad = mUtil.get_String("Introduzca una cadena: ");
                hdlCad.CargarCadena(sCad);
                break;
            case 'B':
                hdlCad.MostrarCadena();
                break;
            case 'C':
                hdlCad.MostrarDimension();
                break;
            case 'D':
                hdlCad.ConvertirEnMayuscula();
                break;
            case 'E':
                hdlCad.ConvertirEnMinuscula();
                break;
            case 'F':
                hdlCad.ConvertirPrimeraLetraMayuscula();
                break;
            case 'G':
                //hdlCad.();
                break;
            case 'H':
                //hdlCad.();
                break;
            case 'I':
                //hdlCad.();
                break;
            case 'J':
                //hdlCad.();
                break;
            case 'K':
                //hdlCad.();
                break;
            case 'L':
                //hdlCad.();
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
