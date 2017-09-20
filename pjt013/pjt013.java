class Main {

    //Implementación del procedimiento principal MAIN
    //Interfaz (runner)
    public static void main (String[] args){
        int iNum;
        byte yPos;
/**
        java.util.Scanner iNumero = new java.util.Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        iNum = iNumero.nextInt();

        java.util.Scanner iPosicion = new java.util.Scanner(System.in);
        System.out.print("Introduzca la posición a consultar: ");
        yPos = iPosicion.nextByte();

        hdlNumero objNumerito = new hdlNumero();

        //objNumerito.probarMetodoNumeroDigitos(iNum);
        objNumerito.probarDigitoPosicion(iNum, yPos);
**/

        iNum = get_Int("Introduzca un numero: ");
        yPos = get_Byte("Introduzca la posición a consultar: ");

        hdlNumero objNumerito = new hdlNumero();

        objNumerito.probarDigitoPosicion(iNum, yPos);

    }


    public static int get_Int (String msg){
        int iNum;

        java.util.Scanner iNumero = new java.util.Scanner(System.in);
        System.out.print(msg);
        iNum = iNumero.nextInt();

        return iNum;
    }


    public static byte get_Byte (String msg){
        byte yNum;

        java.util.Scanner yNumero = new java.util.Scanner(System.in);
        System.out.print(msg);
        yNum = yNumero.nextByte();

        return yNum;
    }

}