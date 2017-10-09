package groupbytes.com.hdl;

import groupbytes.com.cls.clsDigito;

public class hdlDigito {
    private static clsDigito objDig = new clsDigito();  //Creamos un objeto Número


    //Implementación de los Métodos que manipularan los objetos e intancias de la clase Número
    //Negocio (controladores)

    public static void CargarDigito (byte dig){
        objDig.setDigito(dig);
    }


    public static void MostrarDigito (){
        byte yDig = objDig.getDigito();

        System.out.print("El el valor del objDig es: " + yDig);
    }


    public static void ParImpar (byte num){
        clsDigito objDig = new clsDigito();

        objDig.setDigito(num);

        if (objDig.Par()){
            System.out.println("PAR");
        }

        if (objDig.Impar()){
            System.out.println("IMPAR");
        }

        System.out.print("");
    }


    public static void EsPrimo (byte num){
        clsDigito objDig = new clsDigito();

        objDig.setDigito(num);

        if (objDig.Primo()){
            System.out.println("PRIMO");
        }else{
            System.out.println("NO PRIMO");
        }

        System.out.print("");
    }


    public static void EsDivisible (byte num){
        byte bDiv;
        clsDigito objDig = new clsDigito();

        objDig.setDigito(num);

        java.util.Scanner inByte = new java.util.Scanner(System.in);
        System.out.print("Introduzca el digito de divisibilidad: ");
        bDiv = inByte.nextByte();

        if (objDig.Divisible(bDiv)){
            System.out.println("Divisible");
        }else{
            System.out.println("No Divisible");
        }

        System.out.print("");
    }


    public static void EncendidoApagado (byte num){
        clsDigito objDig = new clsDigito();

        objDig.setDigito(num);

        if (objDig.Encendido()){
            System.out.println("El bit esta ENCENDIDO");
        }

        if (objDig.Apagado()){
            System.out.println("El bit esta APAGADO");
        }

        System.out.print("");
    }



}
