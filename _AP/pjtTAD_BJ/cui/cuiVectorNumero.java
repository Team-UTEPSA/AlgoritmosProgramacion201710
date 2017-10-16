package cui;

import hdl.hdlVectorNumero;

public class cuiVectorNumero {
    private  static clsUtils mUtil = new clsUtils();
    private static hdlVectorNumero hdlVec = new hdlVectorNumero();

    //Implementación del procedimiento principal MAIN
    //Interfaz del Usuario (runner)
    public static void main (String[] args){
        mostrar_menu();
        elegir_opcion();
    }


    public static void mostrar_menu (){
        mUtil.LimpiarPantalla();
        System.out.print("\n---- CLASE VECTOR ----\n\n");

        System.out.print("\t[A] Dimensionar Vector\n");
        System.out.print("\t[B] Adicionar un elemento\n");
        System.out.print("\t[C]    Adicionar varios elementos\n");
        System.out.print("\t[D] Cargar Vector randomico\n");
        System.out.print("\t[E] Obtener primer elemento\n");
        System.out.print("\t[F] Obtener el elemento de la posicion\n");
        System.out.print("\t[G] Listar todos los elementos\n");
        System.out.print("\t[H] Obtener ultimo elemento\n");
        System.out.print("\t[I] Cantidad de elementos\n");
        System.out.print("\t[J] Dimension maxima\n");
        System.out.print("\t[K] Vector es binario\n");
        System.out.print("\t[L] XXXX\n");
        System.out.print("\t[M] XXXX\n");
        System.out.print("\t[N] XXXX\n");


        System.out.print("\t[S] Salir\n");
        System.out.print("\n");
    }


    public static void elegir_opcion (){
        long iNum;

        char cOpcion = mUtil.get_Opcion("Elija una opción: ");
        System.out.print("\n");

        switch(cOpcion){
            case 'A':
                int iDimMax = mUtil.get_Int("Escriba la dimension maxima del Vector: ");
                hdlVec.DimensionarVector(iDimMax);
                break;
            case 'B':
                iNum = mUtil.get_Long("Escriba un numero: ");
                hdlVec.CargarElemento(iNum);                
                break;
            case 'C':
                //long[] vec;
                //hdlVec.CargarElementos(vec);
                break;
            case 'D':
                int iCantEle = mUtil.get_Int("Escriba la cantidad de elementos: ");
                hdlVec.CargarRandomico(iCantEle);
                break;
            case 'E':
                hdlVec.ObtenerPrimerElemento();
                break;
            case 'F':
                int iPos = mUtil.get_Int("Posicion a consultar: ");
                hdlVec.ObtenerElemento(iPos);                
                break;
            case 'G':
                hdlVec.ObtenerElementos();
                break;
            case 'H':
                hdlVec.ObtenerUltimoElemento();
                break;
            case 'I':
                hdlVec.ObtenerCantidadElementos();
                break;
            case 'J':
                hdlVec.ObtenerDimensionMaxima();
                break;
            case 'K':
                hdlVec.vectorBinario();
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