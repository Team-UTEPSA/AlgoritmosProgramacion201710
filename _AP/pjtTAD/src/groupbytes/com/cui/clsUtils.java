package groupbytes.com.cui;

public class clsUtils {

    public static void LimpiarPantalla (){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }


    public static long get_Long (String cad){
        java.util.Scanner entrada = new java.util.Scanner(System.in);
        System.out.print(cad);
        long iNum = entrada.nextLong();

        return iNum;
    }


    public static int get_Int (String cad){
        java.util.Scanner entrada = new java.util.Scanner(System.in);
        System.out.print(cad);
        int iNum = entrada.nextInt();

        return iNum;
    }


    public static byte get_Byte (String cad){
        java.util.Scanner entrada = new java.util.Scanner(System.in);
        System.out.print(cad);
        byte yNum = entrada.nextByte();

        return yNum;
    }


    public static String get_String (String cad){
        java.util.Scanner entrada = new java.util.Scanner(System.in);
        System.out.print(cad);
        String sCad = entrada.nextLine();

        return sCad;
    }


    public static char get_Char (String cad){
        char cChar;
        do{
            java.util.Scanner entrada = new java.util.Scanner(System.in);
            System.out.print(cad);
            String sEntrada = entrada.next();
            cChar = sEntrada.charAt(0);
        }while((int)cChar<0 || (int)cChar>127);

        return cChar;
    }


    public static char get_Opcion (String cad){
        char cChar;
        do{
            java.util.Scanner entrada = new java.util.Scanner(System.in);
            System.out.print(cad);
            String sEntrada = entrada.next();
            sEntrada = sEntrada.toUpperCase();
            cChar = sEntrada.charAt(0);
        }while((int)cChar<65 || (int)cChar>90);

        return cChar;
    }


    public static char get_Letra (String cad){
        char cChar;
        do{
            java.util.Scanner TextEscanner = new java.util.Scanner(System.in);
            System.out.print(cad);
            String sEntrada = TextEscanner.next();
            sEntrada = sEntrada.toUpperCase();
            cChar = sEntrada.charAt(0);
        }while((int)cChar<65 || (int)cChar>90);

        return cChar;
    }


}
