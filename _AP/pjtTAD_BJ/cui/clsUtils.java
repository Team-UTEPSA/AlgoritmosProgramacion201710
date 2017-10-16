package cui;

public class clsUtils {

    public static void LimpiarPantalla (){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }


    public static long get_Long (String msg){
        try
        {
            java.util.Scanner entrada = new java.util.Scanner(System.in);
            System.out.print(msg);
            long iNum = entrada.nextLong();
    
            return iNum;
        }
        catch (Exception e)
        {
            System.out.print("ERROR:: Dato inválido o fuera de rango\n");
            System.out.print(e);
            return -1;
        }
    }


    public static int get_Int (String msg){
        try
        {
            java.util.Scanner entrada = new java.util.Scanner(System.in);
            System.out.print(msg);
            int iNum = entrada.nextInt();
    
            return iNum;
        }
        catch (Exception e)
        {
            System.out.print("ERROR:: Dato inválido o fuera de rango\n");
            System.out.print(e);
            return -1;
        }
    }


    public static byte get_Byte (String msg){
        try
        {
            java.util.Scanner entrada = new java.util.Scanner(System.in);
            System.out.print(msg);
            byte yNum = entrada.nextByte();
    
            return yNum;
        }
        catch (Exception e)
        {
            System.out.print("ERROR:: Dato inválido o fuera de rango\n");
            System.out.print(e);
            return -1;
        }
    }


    public static String get_String (String msg){
        try
        {
        java.util.Scanner entrada = new java.util.Scanner(System.in);
        System.out.print(msg);
        String sCad = entrada.nextLine();

        return sCad;
        }
        catch (Exception e)
        {
            System.out.print("ERROR:: Dato inválido o fuera de rango\n");
            System.out.print(e);
            return "";
        }
    }


    public static char get_Char (String msg){
        try
        {
            char cChar;
            do{
                java.util.Scanner entrada = new java.util.Scanner(System.in);
                System.out.print(msg);
                String sEntrada = entrada.next();
                cChar = sEntrada.charAt(0);
            }while((int)cChar<0 || (int)cChar>127);
    
            return cChar;
        }
        catch (Exception e)
        {
            System.out.print("ERROR:: Dato inválido o fuera de rango\n");
            System.out.print(e);
            return ' ';
        }
    }


    public static char get_Opcion (String msg){
        try
        {
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
        catch (Exception e)
        {
            System.out.print("ERROR:: Dato inválido o fuera de rango\n");
            System.out.print(e);
            return ' ';
        }
    }


    public static char get_Letra (String msg){
        try
        {
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
        catch (Exception e)
        {
            System.out.print("ERROR:: Dato inválido o fuera de rango\n");
            System.out.print(e);
            return ' ';
        }        
    }


    
    
}
