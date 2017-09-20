class Main {
    private static hdlNumero objNumero = new hdlNumero();

    //Implementación del procedimiento principal MAIN
    //Interfaz (runner)
    public static void main (String[] args){
        mostrar_menu();
        elegir_opcion();
    }


    public static void mostrar_menu (){
        limpiar_pantalla();
        System.out.print("---- CLASE NÚMERO ----\n\n");

        System.out.print("\t[A] Cargar\n");
        System.out.print("\t[B] Mostrar\n");
        System.out.print("\t[D] Mostrar dígitos pares\n");
        System.out.print("\t[E] Mostrar dígitos impares\n");
        System.out.print("\t[C] Número dígitos pares\n");
        System.out.print("\t[F] Número dígitos impares\n");
        System.out.print("\t[S] Salir\n");

        System.out.print("\n");
    }


    public static void limpiar_pantalla (){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }


    public static void elegir_opcion (){
        int iNum;
        char cOpcion;
        int k;
        cOpcion = get_letra("Elija una opción: ");

        switch(cOpcion){
            case 'A':
                iNum = get_int("Introduzca un numero: ");
                objNumero.probarCargarNumero(iNum);
                System.out.print("\n");
                k = get_int("");
                break;
            case 'B':
                objNumero.probarMostrarNumero();
                System.out.print("\n");
                k = get_int("");

                break;
            case 'C':
                System.out.print(cOpcion);
                k = get_int("");
                break;
            case 'S':
                limpiar_pantalla();
                System.exit(0);
                break;
            default:
                System.out.print("ERROR:: Opción no disponible...");
                k = get_int("");
                //break;

        }

        System.out.print("\n");

        mostrar_menu();
        elegir_opcion();

    }


    public static int get_int (String msg){
        int iNum;

        java.util.Scanner iNumero = new java.util.Scanner(System.in);
        System.out.print(msg);
        iNum = iNumero.nextInt();

        return iNum;
    }


    public static byte get_byte (String msg){
        byte yNum;

        java.util.Scanner yNumero = new java.util.Scanner(System.in);
        System.out.print(msg);
        yNum = yNumero.nextByte();

        return yNum;
    }


    public static char get_letra (String msg){
        String sEntrada;
        char cChar;

        do{
            java.util.Scanner TextEscanner = new java.util.Scanner(System.in);
            System.out.print(msg);
            sEntrada = TextEscanner.next();
            sEntrada = sEntrada.toUpperCase();
            cChar = sEntrada.charAt(0);
        }while((int)cChar<65 || (int)cChar>90);

        return cChar;
    }


}