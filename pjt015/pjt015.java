class Main {
    private static hdlNumero objNumero = new hdlNumero();

    //Implementación del procedimiento principal MAIN
    //Interfaz del Usuario (runner)
    public static void main (String[] args){
        mostrar_menu();
        elegir_opcion();
    }


    public static void mostrar_menu (){
        limpiar_pantalla();
        System.out.print("---- CLASE NÚMERO ----\n\n");

        System.out.print("\t[A] Cargar\n");
        System.out.print("\t[B] Mostrar\n");
        System.out.print("\t[C] Mostrar dígitos pares\n");
        System.out.print("\t[D] Mostrar dígitos impares\n");
        System.out.print("\t[E] Cantidad dígitos pares\n");
        System.out.print("\t[F] Cantidad dígitos impares\n");
        System.out.print("\t[G] Teorema de la numeración\n");
        System.out.print("\t[S] Salir\n");

        System.out.print("\n");
    }


    public static void limpiar_pantalla (){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }


    public static void elegir_opcion (){
        int iNum;
        int k;

        char cOpcion = get_letra("Elija una opción: ");

        switch(cOpcion){
            case 'A':
                iNum = get_int("Introduzca un numero: ");
                objNumero.CargarNumero(iNum);
                break;
            case 'B':
                objNumero.MostrarNumero();
                break;
            case 'C':
                objNumero.MostrarDigitosPares();
                break;
            case 'D':
                objNumero.MostrarDigitosImpares();
                break;
            case 'E':
                objNumero.MostrarCantidadDigitosPares();
                break;
            case 'F':
                objNumero.MostrarCantidadDigitosImpares();
                break;
            case 'G':
                objNumero.TeoremaNumeracion();
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


    public static int get_int (String msg){
        java.util.Scanner iNumero = new java.util.Scanner(System.in);
        System.out.print(msg);
        int iNum = iNumero.nextInt();

        return iNum;
    }


    public static byte get_byte (String msg){
        java.util.Scanner yNumero = new java.util.Scanner(System.in);
        System.out.print(msg);
        byte yNum = yNumero.nextByte();

        return yNum;
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