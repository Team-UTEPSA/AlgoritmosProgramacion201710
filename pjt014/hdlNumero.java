public class hdlNumero {
    private static clsNumero objNum = new clsNumero();  //Creamos un objeto Número

    public void hdlNumero(){
    }

    //Implementación de los Métodos que manipularan los objetos e intancias de la clase Número
    //Negocio (controladores)

    public static void probarCargarNumero (int num){
        objNum.setNumero(num);
    }

    public static void probarMostrarNumero (){
        int iNum = objNum.getNumero();

        System.out.println("El el valor del objNum es: " + iNum);
        System.out.print("");
    }


    public static void probarMetodoNumeroDigitos(int num){
        int iK;

        clsNumero objNum = new clsNumero();

        objNum.setNumero(num);

        iK = objNum.NumeroDigitos();

        System.out.println("El número " + objNum.getNumero() + " tiene " + iK + " digitos");
        System.out.print("");
    }


    public static void probarDigitoPosicion(int num, byte pos){
        int iDig;

        clsNumero objNum = new clsNumero();

        objNum.setNumero(num);

        iDig = objNum.DigitoPosicion(pos);

        System.out.println("En la posición " + pos + " está el número " + iDig);
        System.out.print("");
    }


}