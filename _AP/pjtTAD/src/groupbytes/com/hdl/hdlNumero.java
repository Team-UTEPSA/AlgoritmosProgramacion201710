package groupbytes.com.hdl;

import groupbytes.com.cls.clsNumero;

public class hdlNumero {
    private static clsNumero objNum = new clsNumero();


    //Implementación de los Métodos que manipularan los objetos e intancias de la clase Número
    //Negocio (controladores)

    public static void CargarNumero (int num){
        objNum.setNumero(num);
    }


    public static void MostrarNumero (){
        long iNum = objNum.getNumero();

        System.out.print("El el valor del objNum es: " + iNum);
    }


    public static void MostrarDigitosPares (){
        objNum.getDigitosPares();
    }


    public static void MostrarDigitosImpares (){
        objNum.getDigitosImpares();
    }

    public static void CantidadDigitos (){
        byte k = objNum.getCantidadDigitos();
        System.out.print("El número de digitos de " + objNum.getNumero() + " son " + k);
    }


    public static void MostrarCantidadDigitosPares (){
        byte k = objNum.CantidadDigitosPares();
        System.out.print("El número de digitos pares de " + objNum.getNumero() + " son " + k);
    }


    public static void MostrarCantidadDigitosImpares (){
        byte k = objNum.CantidadDigitosImpares();
        System.out.print("El número de digitos impares de " + objNum.getNumero() + " son " + k);
    }


    public static void TeoremaNumeracion (){
        objNum.TeoremaNumeracion();
    }


    public static void MostrarDigitoPosicion (byte pos){
        byte p = objNum.DigitoPosicion(pos);
        System.out.print("En la posición " + pos + " está el número " + p);
    }




}