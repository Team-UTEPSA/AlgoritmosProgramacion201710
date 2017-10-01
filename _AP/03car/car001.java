class Main {
    private static hdlCaracter hdlCar = new hdlCaracter();

    //Implementación del procedimiento principal MAIN
    //Interfaz del Usuario (runner)
    public static void main (String[] args){
        mostrar_menu();
        elegir_opcion();
    }


    public static void mostrar_menu (){
        limpiar_pantalla();
        System.out.print("---- CLASE CARACTER ----\n\n");

        System.out.print("\t[A] Cargar\n");
        System.out.print("\t[B] Mostrar\n");
        System.out.print("\t[C] Mayuscula\n");
        System.out.print("\t[D] Minuscula\n");
        System.out.print("\t[E] Letra\n");
        System.out.print("\t[F] Digito\n");
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
        char cCar;

        char cOpcion = get_opcion("Elija una opción: ");
        System.out.print("\n");

        switch(cOpcion){
            case 'A':
                cCar = get_char("Introduzca el caracter: ");
                hdlCar.CargarCaracter(cCar);
                break;
            case 'B':
                hdlCar.MostrarCaracter();
                break;
            case 'C':
                hdlCar.EsMayuscula();
                break;
            case 'D':
                hdlCar.EsMinuscula();
                break;
            case 'E':
                hdlCar.EsLetra();
                break;
            case 'F':
                hdlCar.EsDigito();
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