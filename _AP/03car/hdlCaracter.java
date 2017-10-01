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


    public static void EsMayuscula(){
        if(objCar.Mayuscula()){
            System.out.print("El caracter " + objCar.getCaracter() + " es Mayuscula");
        }else{
            System.out.print("El caracter " + objCar.getCaracter() + "  NO es Mayuscula");
        }
    }


    public static void EsMinuscula(){
        if(objCar.Minuscula()){
            System.out.print("El caracter " + objCar.getCaracter() + " es minuscula");
        }else{
            System.out.print("El caracter " + objCar.getCaracter() + "  NO es minuscula");
        }
    }


    public static void EsLetra(){
        if(objCar.Letra()){
            System.out.print("El caracter " + objCar.getCaracter() + " es Letra");
        }else{
            System.out.print("El caracter " + objCar.getCaracter() + "  NO es Letra");
        }
    }


   public static void EsDigito(){
        if(objCar.Digito()){
            System.out.print("El caracter " + objCar.getCaracter() + " es Digito");
        }else{
            System.out.print("El caracter " + objCar.getCaracter() + "  NO es Digito");
        }
   }






}