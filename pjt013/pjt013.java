class Main {

    //Implementación del procedimiento principal MAIN
    //Interfaz (runner)
    public static void main (String[] args){
        int iNum;

        java.util.Scanner iNumero = new java.util.Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        iNum = iNumero.nextInt();

        hdlNumero objNumerito = new hdlNumero();
        objNumerito.probarMetodoNumeroDigitos(iNum);

    }





}