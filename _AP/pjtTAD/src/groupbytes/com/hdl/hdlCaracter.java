package groupbytes.com.hdl;

import groupbytes.com.cls.clsCaracter;

public class hdlCaracter {
    private static clsCaracter objCar = new clsCaracter();  //Creamos un objeto Número


    //Implementación de los Métodos que manipularan los objetos e intancias de la clase Número
    //Negocio (controladores)

    public static void CargarCaracter (char car){
        objCar.setCaracter(car);
    }


    public static void MostrarCaracter (){
        char cCar = objCar.getCaracter();

        System.out.print("El el valor del objDig es: " + cCar);
    }



}
