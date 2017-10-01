public class hdlCaracter {
    private static clsCaracter objCar = new clsCaracter();  //Creamos un objeto Caracter


    public void hdlCaracter(){
    }


    //Implementación de los Métodos que manipularan los objetos e intancias de la clase Caracter
    //Negocio (controlador/manipulador)

    public static void CargarCaracter (char car){
        objCar.setCaracter(car);
    }


    public static void MostrarCaracter(){
        char cCar = objCar.getCaracter();

        System.out.print("El valor del caracter es: " + cCar);
    }


}