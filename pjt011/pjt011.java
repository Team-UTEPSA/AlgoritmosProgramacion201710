class Main {

    //Implementación del procedimiento principal MAIN
    //Interfaz (runner)
    public static void main (String[] args){
        int iNum;

        java.util.Scanner iNumero = new java.util.Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        iNum = iNumero.nextInt();

        //probarClaseNumero(iNum);
        probarMetodoNumeroDigitos(iNum);


    }


    //Métodos Provadores de Procedimientos y Funciones que manipularan
    //los métodos de la clase Número
    //Negocio (controladores)
    public static void probarClaseNumero (int num){
        int iNum;

        clsNumero objNum = new clsNumero();  //Creamos un objeto Número

        objNum.setNumero(num);  //Asignamos el valor al atributo número

        iNum = objNum.getNumero();  //Obtenemos el valor del atributo número

        System.out.println("El el valor del objNum es: " + iNum);  //Mostramos el valor del atributo número
        System.out.print("");  //crea un salto de linea
    }


    public static void probarMetodoNumeroDigitos(int num){
        int iK;

        clsNumero objNum = new clsNumero();

        objNum.setNumero(num);

        iK = objNum.NumeroDigitos();

        System.out.println("El número " + objNum.getNumero() + " tiene " + iK + " digitos");
        System.out.print("");
    }



}