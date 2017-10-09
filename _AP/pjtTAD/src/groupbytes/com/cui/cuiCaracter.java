package groupbytes.com.cui;

import groupbytes.com.hdl.hdlCaracter;

public class cuiCaracter {
    private  static clsUtils mUtil = new clsUtils();
    private static hdlCaracter hdlCar = new hdlCaracter();

    //Implementación del procedimiento principal MAIN
    //Interfaz del Usuario (runner)
    public static void main (String[] args){
        mostrar_menu();
        elegir_opcion();
    }


    public static void mostrar_menu (){
        mUtil.LimpiarPantalla();
        System.out.print("---- CLASE CARACTER ----\n\n");

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
        char cCar;

        char cOpcion = mUtil.get_Opcion("Elija una opción: ");
        System.out.print("\n");

        switch(cOpcion){
            case 'A':
                cCar = mUtil.get_Char("Introduzca un caracter: ");
                hdlCar.CargarCaracter(cCar);
                break;
            case 'B':
                hdlCar.MostrarCaracter();
                break;
            case 'C':
                //hdlCar.();
                break;
            case 'D':
                //hdlCar.();
                break;
            case 'E':
                //hdlCar.();
                break;
            case 'F':
                //hdlCar.();
                break;
            case 'G':
                //hdlCar.();
                break;
            case 'H':
                //hdlCar.();
                break;
            case 'I':
                //hdlCar.();
                break;
            case 'J':
                //hdlCar.();
                break;
            case 'K':
                //hdlCar.();
                break;
            case 'L':
                //hdlCar.();
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
