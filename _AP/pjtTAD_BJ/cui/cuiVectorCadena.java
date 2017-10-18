package cui;

import hdl.hdlVectorCadena;

public class cuiVectorCadena {
    private  static clsUtilsCUI mUtil = new clsUtilsCUI();
    private static hdlVectorCadena hdlVec = new hdlVectorCadena();

    //Implementación del procedimiento principal MAIN
    //Interfaz del Usuario (runner)
    public static void main (String[] args){
        mostrar_menu();
        elegir_opcion();
    }


    public static void mostrar_menu (){
        mUtil.LimpiarPantalla();
        System.out.print("---- CLASE VECTOR ----\n\n");

        System.out.print("\t[A] Dimensionar Vector\n");
        System.out.print("\t[B] XXXX\n");
        System.out.print("\t[C] Adicionar un elemento\n");
        System.out.print("\t[D] XXXX\n");
        System.out.print("\t[E] Obtener un elemento\n");
        System.out.print("\t[F] Obtener todos los elementos\n");
        System.out.print("\t[G] Numero de elementos\n");
        System.out.print("\t[H] XXXX\n");
        System.out.print("\t[I] XXXX\n");
        System.out.print("\t[J] XXXX\n");
        System.out.print("\t[K] XXXX\n");
        System.out.print("\t[L] XXXX\n");
        System.out.print("\t[M] XXXX\n");
        System.out.print("\t[N] XXXX\n");


        System.out.print("\t[S] Salir\n");
        System.out.print("\n");
    }


    public static void elegir_opcion (){
        String sCad;

        char cOpcion = mUtil.get_Opcion("Elija una opción: ");
        System.out.print("\n");

        switch(cOpcion){
            case 'A':
                int iDimMax = mUtil.get_Int("Introduzca la dimension maxima del Vector: ");
                hdlVec.DimensionarVector(iDimMax);
                break;
            case 'B':
                //hdlVec.();
                break;
            case 'C':
                sCad = mUtil.get_String("Ingrese una cadena: ");
                hdlVec.CargarElemento(sCad);
                break;
            case 'D':
                //hdlVec.();
                break;
            case 'E':
                int iPos = mUtil.get_Int("Posicion a consultar: ");
                hdlVec.ObtenerElemento(iPos);
                break;
            case 'F':
                hdlVec.ObtenerElementos();
                break;
            case 'G':
                hdlVec.CantidadElementos();
                break;
            case 'H':
                //hdlVec.();
                break;
            case 'I':
                //hdlVec.();
                break;
            case 'J':
                //hdlVec.();
                break;
            case 'K':
                //hdlVec.();
                break;
            case 'L':
                //hdlVec.();
                break;
            case 'M':
                //hdlVec.();
                break;
            case 'N':
                //hdlVec.();
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