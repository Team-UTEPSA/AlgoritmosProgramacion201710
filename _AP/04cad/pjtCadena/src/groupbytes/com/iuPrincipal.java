package groupbytes.com;

public class iuPrincipal {

    private static hdlObjetos hdlCad = new hdlObjetos();

    //Implementación del procedimiento principal MAIN
    //Interfaz del Usuario (runner)
    public static void main (String[] args){
        mostrar_menu();
        elegir_opcion();
    }


    public static void mostrar_menu (){
        limpiar_pantalla();
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


    public static void limpiar_pantalla (){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }


    public static void elegir_opcion (){
        String sCad;

        char cOpcion = get_opcion("Elija una opción: ");
        System.out.print("\n");

        switch(cOpcion){
            case 'A':
                sCad = get_string("Introduzca una cadena: ");
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
                limpiar_pantalla();
                System.exit(0);
                break;
            default:
                System.out.print("ERROR:: Opción no disponible...\n");
                break;
        }

        System.out.print("\n\n");
        cOpcion = get_opcion("[S] Salir: ");
        main(null);
    }


    public static String get_string (String msg){
        java.util.Scanner entrada = new java.util.Scanner(System.in);
        System.out.print(msg);
        String sCad = entrada.nextLine();

        return sCad;
    }


    public static char get_opcion (String msg){
        char cChar;
        do{
            java.util.Scanner entrada = new java.util.Scanner(System.in);
            System.out.print(msg);
            String sEntrada = entrada.next();
            sEntrada = sEntrada.toUpperCase();
            cChar = sEntrada.charAt(0);
        }while((int)cChar<65 || (int)cChar>90);

        return cChar;
    }


    public static char get_char (String msg){
        char cChar;
        do{
            java.util.Scanner entrada = new java.util.Scanner(System.in);
            System.out.print(msg);
            String sEntrada = entrada.next();
            cChar = sEntrada.charAt(0);
        }while((int)cChar<0 || (int)cChar>127);

        return cChar;
    }











}
