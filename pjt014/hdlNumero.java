public class hdlNumero {
    private static clsNumero objNum = new clsNumero();  //Creamos un objeto Número


    public void hdlNumero(){
    }


    //Implementación de los Métodos que manipularan los objetos e intancias de la clase Número
    //Negocio (controladores)

    public static void CargarNumero (int num){
        objNum.setNumero(num);
    }


    public static void MostrarNumero (){
        int iNum = objNum.getNumero();

        System.out.print("El el valor del objNum es: " + iNum);
    }


    public static void MostrarDigitosPares (){
        objNum.getDigitosPares();
    }


    public static void MostrarDigitosImpares (){
        objNum.getDigitosImpares();
    }


    public static void MostrarCantidadDigitosPares (){
        byte k = objNum.getCantidadDigitosPares();
        System.out.print("El número de digitos pares de " + objNum.getNumero() + " son " + k);
    }


    public static void MostrarCantidadDigitosImpares (){
        byte k = objNum.getCantidadDigitosImpares();
        System.out.print("El número de digitos impares de " + objNum.getNumero() + " son " + k);
    }


    public static void probarMetodoNumeroDigitos(int num){
        int iK;
        clsNumero objNum = new clsNumero();

        objNum.setNumero(num);
        iK = objNum.NumeroDigitos();
        System.out.println("El número " + objNum.getNumero() + " tiene " + iK + " digitos");
    }


    public static void probarDigitoPosicion(int num, byte pos){
        int iDig;

        clsNumero objNum = new clsNumero();

        objNum.setNumero(num);

        iDig = objNum.DigitoPosicion(pos);

        System.out.println("En la posición " + pos + " está el número " + iDig);
    }


}