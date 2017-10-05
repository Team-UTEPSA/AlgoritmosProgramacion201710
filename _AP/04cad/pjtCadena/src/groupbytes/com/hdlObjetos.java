package groupbytes.com;


public class hdlObjetos {
    private static clsCadena objCad = new clsCadena();  //Creamos un objeto Cadena


    public void hdlObjetos(){
    }


    //Implementación de los Métodos que manipularan los objetos e intancias de la clase Cadena
    //Negocio (controlador/manipulador)

    public static void CargarCadena (String cad){
        objCad.setCadena(cad);
    }


    public static void MostrarCadena(){
        String sCad = objCad.getCadena();
        System.out.print("El el valor de la cadena es: " + sCad);
    }


    public static void MostrarDimension(){
        int iDim = objCad.getDimension();
        System.out.print("El el valor de la cadena es: " + iDim);
    }


    public static void ConvertirEnMayuscula(){
        objCad.aMayuscula();
        System.out.print("Ejecutado...");
    }


    public static void ConvertirEnMinuscula(){
        objCad.aMinuscula();
        System.out.print("Ejecutado...");
    }


    public static void ConvertirPrimeraLetraMayuscula(){
        objCad.PrimeraLetraMayuscula();
        System.out.print("Ejecutado...");
    }






}

