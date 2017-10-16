package hdl;

import cls.clsNumero;

public class hdlNumero {
    private static clsNumero objNum = new clsNumero();


    //Implementación de los Métodos que manipularan los objetos e intancias de la clase Número
    //Negocio (controladores)

    public static void CargarNumero (long num){
        objNum.setNumero(num);
    }


    public static void MostrarNumero (){
        long iNum = objNum.getNumero();

        System.out.print("El el valor del objNum es: " + iNum);
    }


    public static void MostrarDigitosPares (){
        System.out.print("Digitos pares: " + objNum.CantidadDigitosPares());
    }


    public static void MostrarDigitosImpares (){
        System.out.print("Digitos pares: " + objNum.CantidadDigitosImpares());
    }

    public static void CantidadDigitos (){
        byte k = objNum.CantidadDigitos();
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


    public static void MostrarDigitoMayor (){
        byte yMy = objNum.DigitoMayor();
        System.out.print("El dígito mayor de " + objNum.getNumero() + " es: " + yMy);
    }


    public static void MostrarCantidadDigitos (byte dig){
        byte yCant = objNum.Cantidad(dig);
        System.out.print("En numero " + objNum.getNumero() + " tiene " + yCant + " digitos " + dig);
    }


    public static void NumeroEsPrimo (){
        if (objNum.Primo()){
            System.out.print("El numero es Primo");
        }else {
            System.out.print("El numero NO es Primo");
        }



    }





}