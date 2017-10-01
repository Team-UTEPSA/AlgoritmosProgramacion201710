class Main {
    private static hdlCadena hdlCad = new hdlCadena();

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
        System.out.print("\t[D] XXX\n");
        System.out.print("\t[E] XXX\n");
        System.out.print("\t[F] XXX\n");
        System.out.print("\t[G] XXX\n");
        System.out.print("\t[H] XXX\n");
        System.out.print("\t[I] XXX\n");

        System.out.print("\t[S] Salir\n");

        System.out.print("\n");
    }


    public static void limpiar_pantalla (){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }


    public static void elegir_opcion (){
        String sCad;

        char cOpcion = get_letra("Elija una opción: ");

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
                //hdlCad.();
                break;
            case 'E':
                //hdlCad.();
                break;
            case 'F':
                //hdlCad.();
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




            case 'S':
                limpiar_pantalla();
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


    public static String get_string (String msg){
        java.util.Scanner sCadena = new java.util.Scanner(System.in);
        System.out.print(msg);
        String sCad = sCadena.nextLine();

        return sCad;
    }


    public static char get_letra (String msg){
        char cChar;
        do{
            java.util.Scanner TextEscanner = new java.util.Scanner(System.in);
            System.out.print(msg);
            String sEntrada = TextEscanner.next();
            sEntrada = sEntrada.toUpperCase();
            cChar = sEntrada.charAt(0);
        }while((int)cChar<65 || (int)cChar>90);

        return cChar;
    }




}